package be.intecbrussel.the_notebook.service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

import be.intecbrussel.the_notebook.enteties.animal_enteties.*;
import be.intecbrussel.the_notebook.enteties.plant_enteties.Plant;

public class ForestNotebook {
	private List<Carnivore> carnivores;
	private List<Omnivore> omnivores;
	private List<Herbivore> herbivores;
	private int plantCount;
	private int animalCount;
	private List<Animal> animals;
	private List<Plant> plants;

	public ForestNotebook() {
		carnivores = new ArrayList<Carnivore>();
		omnivores = new ArrayList<Omnivore>();
		herbivores =  new ArrayList<Herbivore>();
		animals = new ArrayList<Animal>();
		plants = new ArrayList<Plant>();
		
	}

	public List<Carnivore> getCarnivores() {
		return carnivores;
	}

	public List<Omnivore> getOmnivores() {
		return omnivores;
	}

	public List<Herbivore> getHerbivores() {
		return herbivores;
	}

	public int getPlantCount() {
		this.plantCount = plants.size();
		return this.plantCount;
	}

	public int getAnimalCount() {
		this.animalCount = animals.size();
		return this.animalCount;
	}

	public void setCarnivores(List<Carnivore> carnivores) {
		this.carnivores = carnivores;
	}

	public void setOmnivores(List<Omnivore> omnivores) {
		this.omnivores = omnivores;
	}

	public void setHerbivores(List<Herbivore> herbivores) {
		this.herbivores = herbivores;
	}

	public void addAnimal(Animal animalToAdd) {
		long animalFound = animals.stream()
									.filter(Objects:: nonNull)
									.filter(a-> a.getName().equalsIgnoreCase(animalToAdd.getName()))
									.count();
		if(animalFound == 0) {
			animals.add(animalToAdd);
			addToSpecificSoortAnimalList(animalToAdd);
		}
		else {
			System.out.println("Already exist! ");
		}

	}

	// Add the animal to the specific animal list
	private void addToSpecificSoortAnimalList(Animal animalToAdd) {
		if (animalToAdd instanceof Carnivore)
			carnivores.add((Carnivore) animalToAdd);
		if (animalToAdd instanceof Omnivore)
			omnivores.add((Omnivore) animalToAdd);
		if (animalToAdd instanceof Herbivore)
			herbivores.add((Herbivore) animalToAdd);
	}

	public void addPlant(Plant plantToAdd) {
		long plantFound = plants.stream()
								.filter(Objects:: nonNull)
								.filter(p-> p.getName().equalsIgnoreCase(plantToAdd.getName()))
								.count();
		if(plantFound == 0) {
					plants.add(plantToAdd);
		}
		else {
				System.out.println("Already exist! ");
		}
	}

	public void printNotebook() {
		System.out.println("NOTEBOOK DETAILS: \n");
		
		System.out.println("\n ----->Planten: -----------------------with total: " + getPlantCount() + "\n");
		plants.forEach(p -> System.out.println("*" + p.getName() + ", Height: " + p.getHeight()));
		
		System.out.println("\n ----->Animals: -----------------------with total: " + getAnimalCount() + "\n");
		animals.forEach(a -> System.out.println("*" + a));
	}

	public void sortAnimalsByName() {
		animals.sort(Comparator.comparing(Animal:: getName));
	}
	
	public void sortPlantsByName() {
		plants.sort(Comparator.comparing(Plant:: getName));
	}
	
	public void sortAnimalsByHeight() {
		animals.sort(Comparator.comparing(Animal:: getHeight));
	}
	
	public void sortPlantsByHeight() {
		plants.sort(Comparator.comparing(Plant:: getHeight));
	}	
}
