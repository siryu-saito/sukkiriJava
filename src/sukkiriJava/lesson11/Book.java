package sukkiriJava.lesson11;

public class Book extends TangibleAsset {
	String isbn;
	
	// コンストラクタ
	public Book (String name, int price, String color, String isbn) {
		super (name, color, price);
		this.isbn = isbn;
	}
	
	// メソッド
	public String getIsbn() { return this.isbn;  }
}
