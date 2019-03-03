package creational.abstract_factory;

public class ParrotFactory implements BirdFactory {

	@Override
	public Bird getBird(String color, String beakType) {
		return new Parrot(color, beakType);
	}

}
