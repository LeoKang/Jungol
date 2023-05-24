package q113;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int c = sc.nextInt();
		sc.close();

//		System.out.println(r + " " + c);

		r = r + 5; // r += 5;
		c = c * 2; // c *= 2;

//		System.out.println(r + " " + c);

		System.out.println("width = " + r);
		System.out.println("length = " + c);
		System.out.println("area = " + (r * c));
	}
}
