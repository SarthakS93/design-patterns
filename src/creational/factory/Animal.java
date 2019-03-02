package creational.factory;

/**
 * 
 * @author sarthak
 * 
 * This is animal abstract class
 * 
 * Here i have specified some common methods for all animals
 * 
 * This is a superclass, subclasses will implement this interface
 *
 * @date 01-Mar-2019
 */

public abstract class Animal {
	
	public abstract String getName();
	
	public abstract Integer getLegs();
	
	public abstract String getAnimalSound();

}
