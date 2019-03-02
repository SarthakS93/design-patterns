package creational;

import creational.factory.Animal;
import creational.factory.FactoryClass;

public class CreationalPatterns {

	public static void simulateFactoryPattern() {
		System.out.println("Simulating factory pattern");
		Animal cat = FactoryClass.getAnimal("Cat", "kitty");
		System.out.println(cat.getAnimalSound());
		
		Animal dog = FactoryClass.getAnimal("Dog", "bruno");
		System.out.println(dog.getAnimalSound());
	}
	
	
	
}
