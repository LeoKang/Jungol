package q575;

import java.util.Scanner;

public class Main {
	public static int naeun(int p1, int p2) {
		int ret = 1;
		for (int i = 0; i < p2; i++) {
			ret *= p1;
		}

		return ret;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		sc.close();

//		System.out.println(n1 + " " + n2);
		int r = naeun(n1, n2);
		System.out.println(r);
	}
}
