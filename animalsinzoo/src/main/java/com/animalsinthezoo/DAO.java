package com.animalsinthezoo;


import java.sql.*;
import java.util.ArrayList;

public class DAO {
	static final String DB_URL = "jdbc:mysql://localhost:3306/?user=root&autoReconnect=true&useSSL=false";
	static final String User = "root";
	static final String PASSWORD = "root";
	
	static Connection CONN = null;;
	static Statement STMT = null;
	static PreparedStatement PREP_STMT = null;
	static ResultSet RES_SET = null;
	
	public static void connToDB(){
		try {
			System.out.println("Trying to connect to the DB...");
			CONN = DriverManager.getConnection(DB_URL, User, PASSWORD);
			System.out.println("Connected to DB. ");
		} catch (SQLException e) {
			System.out.println("Connection failed");
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void readFromDB()
	{
		connToDB();
		
		ArrayList<Animal>ourAnimals = new ArrayList<>();
		
		try {
			STMT = CONN.createStatement();
			RES_SET = STMT.executeQuery("SELECT * FROM students.animals_at_zoo;");
			
			while(RES_SET.next())
			{
				Animal animalInDB = new Animal();
				
				animalInDB.setAnimals_id(RES_SET.getString("animals_id"));
				animalInDB.setSpecies(RES_SET.getString("species"));
				animalInDB.setType_of_cage(RES_SET.getString("Type_of_cage"));
				animalInDB.setFood(RES_SET.getString("food"));
				animalInDB.setName(RES_SET.getString("name"));
				animalInDB.setWeight(RES_SET.getDouble("weight"));
				
				
				ourAnimals.add(animalInDB);
			}
			
			for (Animal animal : ourAnimals) {
				System.out.println(animal.toString());
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
