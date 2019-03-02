package creational.factory;

/**
 * 
 * @author sarthak
 *
 * Subclass, extends Animal class
 * 
 * @date 01-Mar-2019
 */

public class Cat extends Animal {
	
	private String name;
	
	private Integer legs;
	
	private String sound;
	
	public Cat() {}
	
	public Cat(String name) {
		this.name = name;
		legs = 4;
		sound = "Purr";
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public Integer getLegs() {
		return legs;
	}

	@Override
	public String getAnimalSound() {
		return sound;
	}

}
