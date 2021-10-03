package sukkiriJava.lesson11;

public class Computer extends TangibleAsset {
	String makerName;
	
	// コンストラクタ
	public Computer (String name, int price, String color, String makerName) {
		super (name, color, price);
		this.makerName = makerName;
	}
	
	// メソッド
	public String getMakerName() { return this.makerName; }
}
