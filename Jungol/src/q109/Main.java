package q109;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		sc.close();

		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);

		int sum = n1 + n2 + n3;
		System.out.println("sum = " + sum);
		System.out.println("sum = " + (n1 + n2 + n3));
		System.out.printf("sum = %d\n", sum);
		System.out.printf("sum = " + sum);

	}
}
