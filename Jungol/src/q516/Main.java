package q516;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc;
		sc = new Scanner(System.in);
		double d1 = sc.nextDouble();
		double d2 = sc.nextDouble();
		String str = sc.next();
		sc.close();

//		System.out.println(d1);
		System.out.printf("%.2f\n", d1);
//		System.out.println(d2);
		System.out.printf("%.2f\n", d2);
		System.out.println(str);
	}
}
