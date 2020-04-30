package be.intecbrussel.the_notebook.enteties.animal_enteties;

import java.util.Set;
import java.util.stream.Collectors;

import be.intecbrussel.the_notebook.enteties.plant_enteties.Plant;

public class Omnivore extends Animal {
	private Set<Plant> plantDiet;
	private double maxFoodSize;

	public Omnivore(String name) {
		super(name);
	}

	public Omnivore(String name, double weight, double height, double length) {
		super(name, weight, height, length);
	}

	public Set<Plant> getPlantDiet() {
		return plantDiet;
	}

	public double getMaxFoodSize() {
		return maxFoodSize;
	}

	public void setPlantDiet(Set<Plant> plantDiet) {
		this.plantDiet = plantDiet;
	}

	public void setMaxFoodSize(double maxFoodSize) {
		this.maxFoodSize = maxFoodSize;
	}

	public void addPlantToDiet(Plant plant) {
		if (plant != null) {
			this.plantDiet.add(plant);
		}
	}

	@Override
	public String toString() {
		return "Name: " + getName() 
			+ ", plantDiet = {" + plantDiet.stream().map(Plant::getName).collect(Collectors.joining(", "))+"}"
			+ ", maximum food size = " + maxFoodSize 
			+ ", weight = "+ getWeight() 
			+ ", height = " + getHeight() 
			+ ", length = " + getLength();
	}

}
