package q632;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] inp = new int[3];
		for (int i = 0; i < inp.length; i++) {
			inp[i] = sc.nextInt();
		}
		sc.close();

//		for (int i = 0; i < inp.length; i++) {
//			System.out.println(inp[i]);
//		}

		int min = Integer.MAX_VALUE;
		for (int i = 0; i < inp.length; i++) {
			if (inp[i] < min) {
				min = inp[i];
			}
		}
		System.out.println(min);
	}
}
