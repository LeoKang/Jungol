package q560;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[10];
		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
		}
		sc.close();

		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
		System.out.println();

//		int min = 1000;
//		int min = Integer.MAX_VALUE;
		int min = num[0];
		for (int i = 0; i < num.length; i++) {
			if(num[i] < min) {
				min = num[i];
			}
		}
		System.out.println(min);
	}
}
