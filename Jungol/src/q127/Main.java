package q127;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean b = true;

		int sum = 0, cnt = 0;
		do {
			int inp = sc.nextInt();
			if (0 > inp || inp > 100) {
				b = false;
			} else {
				sum += inp;
				cnt++;
			}
		} while (b);
		sc.close();

		System.out.println("sum : " + sum);
		System.out.printf("avg : %.1f\n", (double) sum / cnt);
	}
}
