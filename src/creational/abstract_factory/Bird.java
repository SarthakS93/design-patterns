package creational.abstract_factory;

/**
 * 
 * @author sarthak
 * 
 * This is the Bird abstract class
 * 
 * Common methods for all birds are specified in this class
 * 
 * This is a superclass, subclasses will extends this class
 *
 * @date 03-Mar-2019
 */
public abstract class Bird {
	
	public abstract String getColor();
	
	public abstract String getName();
	
	public abstract String getBeakType();

}
