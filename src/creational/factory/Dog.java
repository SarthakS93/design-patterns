package creational.factory;

/**
 * 
 * @author sarthak
 *
 * Subclass, extends Animal class
 * 
 * @date 01-Mar-2019
 */

public class Dog extends Animal {
	
	private String name;
	
	private Integer legs;
	
	private String sound;
	
	public Dog() {}
	
	public Dog(String name) {
		this.name = name;
		legs = 4;
		sound = "Bark";
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
