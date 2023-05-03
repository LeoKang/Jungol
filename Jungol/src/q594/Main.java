package q594;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String inp = sc.next();
		sc.close();

		// 1.
		System.out.print(inp);
		System.out.println(inp);

		// 2.
		System.out.print(inp + inp);
		System.out.println();

		// 3.
		for (int i = 0; i < 10; i++) {
			System.out.print(inp);
		}
	}
}
