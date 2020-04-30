package be.intecbrussel.the_notebook.enteties.plant_enteties;

public class Bush extends Plant {
	private String fruit;
	private LeafType leafType;

	public Bush(String name) {
		super(name);
	}

	public Bush(String name, double height) {
		super(name, height);
	}

	public String getFruit() {
		return fruit;
	}

	public LeafType getLeafType() {
		return leafType;
	}

	public void setFruit(String fruit) {
		this.fruit = fruit;
	}

	public void setLeafType(LeafType leafType) {
		this.leafType = leafType;
	}

	@Override
	public String toString() {
		return "Name: " + getName()
				+", leaf type = " + leafType 
				+", fruit = " + fruit
				+", height = " + getHeight();
	}

}
