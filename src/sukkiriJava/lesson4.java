package sukkiriJava;

public class lesson4 {
	public static void main(String[] args) {
		int[] numbers = {3, 4, 9};
		System.out.print("1桁の数字を入力して下さい>");
		int input = new java.util.Scanner(System.in).nextInt();

		for (int i = 0; i < numbers.length; i++) {
			if (input == numbers[i]) {
				System.out.println("当たり！！！" + " 正解は" + numbers[i] + "でした！！！");
				break;
			} else {
				System.out.println("残念ハズレです！！！");
			}
		}
	}
}