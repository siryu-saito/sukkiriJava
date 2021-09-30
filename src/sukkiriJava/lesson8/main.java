package sukkiriJava.lesson8;

public class main {
	public static void main(String[] args) {
		hero h = new hero();
		h.name = "タカヒロ";
		h.hp = 100;

		matango m1 = new matango();
		m1.hp = 50;
		m1.suffix = 'A';
		matango m2 = new matango();
		m2.hp = 48;
		m2.suffix = 'B';

		h.slip();
		m1.run();
		m2.run();
		h.run();
	}
}
