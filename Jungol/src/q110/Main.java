package q110;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("yard? ");
		double inp = scanner.nextDouble();
		scanner.close();

		System.out.print(inp + "yard = ");
		System.out.printf("%.1fcm", (inp * 91.44));
	}
}
