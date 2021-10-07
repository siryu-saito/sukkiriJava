package sukkiriJava.lesson16;

import java.util.HashMap;
import java.util.Map;

class Hero {
	private String name;
	public Hero(String name) { this.name = name; }
	public String getName() { return this.name; }
}

public class Main {
	public static void main(String[] args) {
		Hero h1 = new Hero("齋藤");
		Hero h2 = new Hero("鈴木");
		Map<Hero, Integer> heroes = new HashMap<Hero, Integer>();
		heroes.put(h1, 3);
		heroes.put(h2, 7);

		for (Hero key : heroes.keySet()) {
			int value = heroes.get(key);
			System.out.println(value);
			System.out.println(key.getName() + "が倒した数=" +  value);
		}
	}
}
