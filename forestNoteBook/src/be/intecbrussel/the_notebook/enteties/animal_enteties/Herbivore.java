package be.intecbrussel.the_notebook.enteties.animal_enteties;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import be.intecbrussel.the_notebook.enteties.plant_enteties.Plant;

public class Herbivore extends Animal {
	private Set<Plant> plantDiet;

	public Herbivore(String name) {
		super(name);
	}

	public Herbivore(String name, double weight, double height, double length) {
		super(name, weight, height, length);
	}

	public Set<Plant> getPlantDiet() {
		return plantDiet;
	}

	public void setPlantDiet(Set<Plant> plantDiet) {
		this.plantDiet = plantDiet;
	}

	public void addPlantToDiet(Plant plant) {
		if (plant != null) {
			this.plantDiet.add(plant);
		}
	}

	public void printDiet() {
		Stream.of(this.plantDiet).forEach(System.out::println);
	}

	@Override
	public String toString() {
		return "Name: " + getName() 
			+", type = " + getClass().getSimpleName()
			+ ", plantDiet = {" + plantDiet.stream().map(Plant::getName).collect(Collectors.joining(", "))+"}"
			+ ", weight = "+ getWeight() 
			+ ", height " + getHeight() 
			+ ", length = " + getLength();
	}

}
