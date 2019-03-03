package creational.abstract_factory;

public class Parrot extends Bird {
	
	private String color;
	
	private String beakType;
	
	public Parrot() {}
	
	public Parrot(String color, String beakType) {
		this.color = color;
		this.beakType = beakType;
	}

	@Override
	public String getColor() {
		return color;
	}

	@Override
	public String getName() {
		return "Parrot";
	}

	@Override
	public String getBeakType() {
		return beakType;
	}

}
