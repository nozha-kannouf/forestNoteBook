package be.intecbrussel.the_notebook.enteties.animal_enteties;

public class Carnivore extends Animal {
	private double maxFoodSize;

	public Carnivore(String name) {
		super(name);
	}

	public Carnivore(String name, double weight, double height, double length) {
		super(name, weight, height, length);
	}

	public double getMaxFoodSize() {
		return maxFoodSize;
	}

	public void setMaxFoodSize(double maxFoodSize) {
		this.maxFoodSize = maxFoodSize;
	}

	@Override
	public String toString() {
		return "Name: " + getName()
				+", type = " + getClass().getSimpleName()
				+", maximum food size = " + getMaxFoodSize() 
				+", weight = " + getWeight()
				+", height = " + getHeight() 
				+", length = " + getLength();
	}

}
