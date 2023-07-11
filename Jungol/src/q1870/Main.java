package q1870;

import java.util.Scanner;

public class Main {
	static int N, M;
	static int[][] ar;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		ar = new int[N][M];
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				ar[i][j] = sc.nextInt();
			}
		}
		sc.close();

		System.out.println(N + " " + M);
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				System.out.printf(ar[i][j] + " ");
			}
			System.out.println();
		}
	}

}
