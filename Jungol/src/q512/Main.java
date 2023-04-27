package q512;

public class Main {
	public static void main(String[] args) {
		int weight = 49;
		double ratio = 0.2683;
		float fRatio = 0.2683f; 

		// case 1
		System.out.printf("%d * %f = %f\n", weight, ratio, weight * ratio);

		// case 2
		System.out.print(weight + " * ");
		System.out.printf("%f = %f\n", ratio, (weight * ratio));
		
		// case 3
		System.out.printf("%d * %f = %f\n", weight, fRatio, weight * fRatio);
		
		int i = 10;
		double d = 10.0;
		float f = 10.0f;
		
		System.out.println(d);
	}
}
