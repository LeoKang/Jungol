package q523;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		sc.close();

//		System.out.println(num1);
//		System.out.println(num2);

		// 3rd case
		System.out.print(num1 + " > " + num2 + " --- ");
		boolean b = (num1 > num2) ? true : false;
		System.out.println(b);
		
		// 2nd case - 2
		System.out.print(num1 + " > " + num2 + " --- ");
		if (num1 > num2) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}

		// 2nd case
		if (num1 > num2) {
			System.out.println(num1 + " > " + num2 + " --- " + true);
		} else {
			System.out.println(num1 + " > " + num2 + " --- " + false);
		}

		// 1st case
//		System.out.println(num1 + " > " + num2 + " --- " + (num1 > num2));
		System.out.println(num1 + " < " + num2 + " --- " + (num1 < num2));
		System.out.println(num1 + " >= " + num2 + " --- " + (num1 >= num2));
		System.out.println(num1 + " <= " + num2 + " --- " + (num1 <= num2));
	}
}
