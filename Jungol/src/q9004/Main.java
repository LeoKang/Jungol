package q9004;

public class Main {
	public static void main(String[] args) {
		int q = 4;

		for (int j = 0; j < q; j++) {
			for (int i = q - 1; i > j; i--) {
				System.out.print(" ");
			}
			System.out.print("@");

			System.out.println();
		}
	}
}
