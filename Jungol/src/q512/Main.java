package q512;

public class Main {
	public static void main(String[] args) {
		int weight = 49;
		double ratio = 0.2683;

		// case 1
		System.out.printf("%d * %f = %f\n", weight, ratio, weight * ratio);

		// case 2
		System.out.print(weight + " * ");
		System.out.printf("%f = %f\n", ratio, (weight * ratio));
	}
}
