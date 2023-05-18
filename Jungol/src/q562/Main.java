package q562;

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

		int sumOdd = 0, sumEven = 0;
//		sumEven = num[1] + num[3] + num[5] + num[7] + num[9];
		for (int i = 1; i < num.length; i += 2) { // i = i + 2;
			sumEven += num[i];
		}

//		sumOdd = num[0] + num[2] + num[4] + num[6] + num[8];
		for (int i = 0; i < num.length; i += 2) { // i = i + 2;
			sumOdd += num[i];
		}

		System.out.println("sum : " + sumEven);
		System.out.printf("avg : %.1f\n", sumOdd / (num.length / (double)2));
	}

}
