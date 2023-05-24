package q126;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// 1단계 : 사용자 입력 처리
		Scanner sc = new Scanner(System.in);

		int odd = 0, even = 0;
		// 무한 loop 구조로 코드 작성
		while (true) {
			int inp = sc.nextInt();

			// 무한 loop - 탈출 조건(0 입력)
			if (inp == 0) {
				break;
				// 홀수 / 짝수 의 갯수 (2로 나눠서 나머지 0, 1)
				// number counting
			} else if (inp % 2 == 0) {
				even++;
			} else {
				odd++;
			}
		}
		sc.close();
		System.out.println("odd : " + odd);
		System.out.println("even : " + even);
	}
}
