package creational.factory;

public class FactoryClass {
	
	public static Animal getAnimal(String animalType, String name) {
		Animal animal = null;
		if (animalType == null) {
			return animal;
		}
		
		if (animalType == "Dog") {
			animal = new Dog(name);
		}
		else if (animalType == "Cat") {
			animal = new Cat(name);
		}
		
		return animal;
	}

}
