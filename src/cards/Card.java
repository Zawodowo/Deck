package cards;
public class Card {
	private String name;
	private String color;
	private int value;
		
	Card(String name, String color, int value) {
		this.name = name;
		this.color = color;
		this.value = value;
	}
	
	public String getName() {
		return name;
	}
	public String getColor() {
		return color;
	}
	public int getValue() {
		return value;
	}
}