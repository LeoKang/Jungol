package q128;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = 0;
		int inp = 0;

		do {
			inp = sc.nextInt();	//workload
			if ((inp % 3 != 0) && (inp % 5 != 0)) {
				cnt++;
			}

//			if (inp % 3 == 0) {
//				// 3의 배수
//			} else if (inp % 5 == 0) {
//				// 5의 배수
//			} else {
//				// 3의 배수와 5의 배수를 제외한 나머지 수
//				cnt++;
//			}
		} while (inp != 0);
		sc.close();
		System.out.println(cnt);
	}
}
