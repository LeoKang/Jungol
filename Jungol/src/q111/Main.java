package q111;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// case 2.
		Scanner sc = new Scanner(System.in);
		int score[] = new int[4];
		for (int i = 0; i < score.length; i++) {
			score[i] = sc.nextInt();
		}
		sc.close();
		for (int i = 0; i < score.length; i++) {
			System.out.print(score[i] + " ");
		}

		int sum = 0;
		for (int i = 0; i < score.length; i++) {
			sum += score[i];
		}
		System.out.println("sum " + sum);
		System.out.println("avg " + sum / score.length);

		// case 1.
//		Scanner sc = new Scanner(System.in);
//		int sum = 0;
//		for (int i = 0; i < 4; i++) {
//			int inp = sc.nextInt();
//			sum += inp;
//		}
//		sc.close();
//
//		System.out.println("sum " + sum);
//		System.out.println("avg " + sum / 4);
	}
}
