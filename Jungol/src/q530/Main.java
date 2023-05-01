package q530;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int age = scan.nextInt();
		scan.close();

//		System.out.println(age);

		if (age >= 20) {
			System.out.println("adult");
		} else {
			System.out.print(20 - age);
			System.out.println(" years later");
		}
	}
}
