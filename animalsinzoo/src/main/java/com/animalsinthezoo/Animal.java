package com.animalsinthezoo;

public class Animal {

	private String animals_id = null;
	private String species = null;
	private String type_of_cage = null;
	private String food = null;
	private String name = null;
	private Double weight = 0.0;
	
	
	public Animal() {
	}


	public String getAnimals_id() {
		return animals_id;
	}


	public void setAnimals_id(String animals_id) {
		this.animals_id = animals_id;
	}


	public String getSpecies() {
		return species;
	}


	public void setSpecies(String species) {
		this.species = species;
	}


	public String getType_of_cage() {
		return type_of_cage;
	}


	public void setType_of_cage(String type_of_cage) {
		this.type_of_cage = type_of_cage;
	}


	public String getFood() {
		return food;
	}


	public void setFood(String food) {
		this.food = food;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Double getWeight() {
		return weight;
	}


	public void setWeight(Double weight) {
		this.weight = weight;
	}


	@Override
	public String toString() {
		return "Animal [animals_id=" + animals_id + ", species=" + species + ", type_of_cage=" + type_of_cage
				+ ", food=" + food + ", name=" + name + ", weight=" + weight + "]";
	}



	
}