package q515;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		sc.close();

		System.out.println(num1);
		System.out.println(num2);

		if (num1 >= num2) {
			// 1. num1 >= num2
//			System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
//			System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
		} else {
			// 2. num1 < num2
//			System.out.println(num2 + " * " + num1 + " = " + (num2 * num1));
//			System.out.println(num2 + " / " + num1 + " = " + (num2 / num1));

			// '2023 하이미디어 구로 박태호'
//			int m = num2 - num1;
//			num2 = num2 - m;
//			num1 = num1 + m;

			// 'swap'
			int tmp = num1;
			num1 = num2;
			num2 = tmp;
		}
		System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
		System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
	}
}
