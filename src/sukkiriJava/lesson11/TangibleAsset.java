package sukkiriJava.lesson11;

public abstract class TangibleAsset extends Assets {
	String color;

	public TangibleAsset (String name, String color, int price) {
		super (name, price);
		this.color = color;
	}

	public String getColor() { return this.color; }
}
