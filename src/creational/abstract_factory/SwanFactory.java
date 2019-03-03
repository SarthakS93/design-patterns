package creational.abstract_factory;

public class SwanFactory implements BirdFactory {

	@Override
	public Bird getBird(String color, String beakType) {
		return new Swan(color, beakType);
	}

}
