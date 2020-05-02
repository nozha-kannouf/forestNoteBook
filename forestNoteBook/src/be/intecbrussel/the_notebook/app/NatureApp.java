package be.intecbrussel.the_notebook.app;

import java.util.HashSet;
import java.util.List;

import be.intecbrussel.the_notebook.enteties.animal_enteties.*;
import be.intecbrussel.the_notebook.enteties.plant_enteties.*;
import be.intecbrussel.the_notebook.service.ForestNotebook;

public class NatureApp {

	public static void main(String[] args) {
		ForestNotebook notebook = new ForestNotebook();
		
		/*
		 * Deel1 
		 */
		
		/*
		 * Five Plants
		 */
		Tree chataigne = new Tree("Castanea sativa", 6_180);
		chataigne.setLeafType(LeafType.NEEDLE);
		notebook.addPlant(chataigne);
		
		Tree tilleul = new Tree("Tilleul d'Overpelt", 8_900);
		tilleul.setLeafType(LeafType.SPEAR);
		notebook.addPlant(tilleul);
		
		Weed weed = new Weed("Broadleaf plantain", 15.24);
		weed.setArea(2.45);
		notebook.addPlant(weed);
		
		Flower flower = new Flower("Hyacinten", 7);
		flower.setSmell(Scent.MUSKY);
		notebook.addPlant(flower);
		
		Bush bush = new Bush("Lavandula", 6);
		bush.setFruit("Lavend fruit :) ");
		bush.setLeafType(LeafType.ROUND);
		notebook.addPlant(bush);
		
		/*
		 * Nine Animals
		 */
		
		Carnivore carnivore1 = new Carnivore("Snakes", 1, 1, 1);
		carnivore1.setMaxFoodSize(70);
		notebook.addAnimal(carnivore1);
		Carnivore carnivore2 = new Carnivore("Lions", 2, 2, 2);
		carnivore2.setMaxFoodSize(85);
		notebook.addAnimal(carnivore2);
		Carnivore carnivore3 = new Carnivore("Toads", 3, 3, 3);
		carnivore3.setMaxFoodSize(100);
		notebook.addAnimal(carnivore3);
		
		Herbivore herbivore1 = new Herbivore("Zebra", 1, 1, 1);
		HashSet<Plant> plantDiet1 = new HashSet<>(List.of(bush, flower));
		herbivore1.setPlantDiet(plantDiet1);
		notebook.addAnimal(herbivore1);
		Herbivore herbivore2 = new Herbivore("Horses", 2, 2, 2);
		HashSet<Plant> plantDiet2 = new HashSet<>(List.of(weed, tilleul));
		herbivore2.setPlantDiet(plantDiet2);
		notebook.addAnimal(herbivore2);
		Herbivore herbivore3 = new Herbivore("Rabbits", 3, 3, 3);
		HashSet<Plant> plantDiet3 = new HashSet<>(List.of(bush, chataigne));
		herbivore3.setPlantDiet(plantDiet3);
		notebook.addAnimal(herbivore3);
		
		Omnivore omnivore1 = new Omnivore("Pigs", 1, 1, 1);
		omnivore1.setMaxFoodSize(89);
		omnivore1.setPlantDiet(plantDiet1);
		notebook.addAnimal(omnivore1);
		Omnivore omnivore2 = new Omnivore("Hedgehogs", 2, 2, 2);
		omnivore2.setMaxFoodSize(89);
		omnivore2.setPlantDiet(plantDiet2);
		notebook.addAnimal(omnivore2);
		Omnivore omnivore3 = new Omnivore("Chickens ", 3, 3, 3);
		omnivore3.setMaxFoodSize(89);
		omnivore3.setPlantDiet(plantDiet3);
		notebook.addAnimal(omnivore3);
		
		
		/*
		 * Deel2 
		 */
	System.out.println("Number of animals in the nootbook is: "+ notebook.getAnimalCount());
	System.out.println("Number of plants in the nootbook is: "+ notebook.getPlantCount());
	System.out.println("\n\n----------------------------------------------------------------");
	
	notebook.printNotebook();
	System.out.println("----------------------------------------------------------------");
	System.out.println("\n List of carnivores: ");
	notebook.getCarnivores().forEach(System.out:: println);
	System.out.println("\n List of herbivores: ");
	notebook.getHerbivores().forEach(System.out:: println);
	System.out.println("\n List of omnivores: ");
	notebook.getOmnivores().forEach(System.out:: println);
	
	System.out.println("\n\n----------------------------------------------------------------");
	System.out.println("Print animals and plants sorted by name: ");
	System.out.println("----------------------------------------------------------------");
	
	notebook.sortAnimalsByName();
	notebook.sortPlantsByName();
	notebook.printNotebook();
	
	System.out.println("\n\n----------------------------------------------------------------");
	System.out.println("Print animals and plants sorted by height: ");
	System.out.println("----------------------------------------------------------------");
	notebook.sortAnimalsByHeight();
	notebook.sortPlantsByHeight();
	notebook.printNotebook();
	}

}
