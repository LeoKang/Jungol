package q557;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] ar = new char[10];
		for (int i = 0; i < ar.length; i++) {
			ar[i] = sc.next().charAt(0);
		}
		sc.close();

//		for (int i = 0; i < ar.length; i++) {
//			System.out.print(ar[i] + " ");
//		}
		System.out.print(ar[0] + " ");
		System.out.print(ar[3] + " ");
		System.out.println(ar[6]);
	}
}
