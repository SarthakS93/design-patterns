package creational.abstract_factory;

public class Swan extends Bird {
	
	private String color;
	
	private String beakType;

	public Swan() {}
	
	public Swan(String color, String beakType) {
		this.color = color;
		this.beakType = beakType;
	}
	
	@Override
	public String getColor() {
		return color;
	}

	@Override
	public String getName() {
		return "Swan";
	}

	@Override
	public String getBeakType() {
		return beakType;
	}

}
