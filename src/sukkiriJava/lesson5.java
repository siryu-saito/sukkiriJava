package sukkiriJava;

public class lesson5 {
	public static void main(String[] args) {
		double triangleArea = calcTriangleArea(10.0, 5.0);
		System.out.println("三角形の面積は" + triangleArea + "平方cm");
		double circeArea = calcCireArea(5.0);
		System.out.println("円の面積は" + circeArea + "平方cm");
	}

	public static double calcTriangleArea(double bottom, double height) {
		double area = (bottom * height) / 2;
		return area;
	}

	public static double calcCireArea(double radius) {
		double area = radius * radius * 3.14;
		return area;
	}
}
