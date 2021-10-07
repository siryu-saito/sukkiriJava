package sukkiriJava.lesson17;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
	public static void main(String[] args) {
		FileWriter fw = null;
		try {
			fw = new FileWriter("data.txt");
			fw.write("hello!");
		} catch (IOException e) {
			System.out.println("何らかの例外が発生しました");
		} finally {
			fw.close();
		}
	}
}
