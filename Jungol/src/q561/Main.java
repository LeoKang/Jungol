package q561;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[10];
		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
		}
		sc.close();

//		for (int i = 0; i < num.length; i++) {
//			System.out.print(num[i] + " ");
//		}
//		System.out.println();

		// 1. 100 미만의 수만 출력
		int max = 0;
		for (int i = 0; i < num.length; i++) {
			if (num[i] < 100) {
//				System.out.print(num[i] + " ");
				if (num[i] > max) {
					max = num[i];
				}
			}
		}
		if (max == 0) {
			max = 100;
		}
//		System.out.println();
		System.out.print(max + " ");
//		System.out.println();

		// 2. 100 이상의 수만 출력
		int min = 10000;
		for (int i = 0; i < num.length; i++) {
			if (num[i] >= 100) {
//				System.out.print(num[i] + " ");
				if (num[i] < min) {
					min = num[i];
				}
			}
		}
		if (min == 10000) {
			min = 100;
		}
//		System.out.println();
		System.out.println(min);
	}
}
