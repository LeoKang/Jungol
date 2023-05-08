package q9017;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("두 개의 실수를 입력하시오. ");
		double d1 = sc.nextDouble();
		double d2 = sc.nextDouble();
		sc.close();

//		System.out.println(d1 + " " + d2);
		System.out.printf("x = %.2f\n", d1);
		System.out.printf("y = %.2f\n", d2);
	}
}
