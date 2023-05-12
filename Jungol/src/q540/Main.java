package q540;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int inp = sc.nextInt();
//			System.out.println(inp);

			if (inp % 3 == 0) { // 3의 배수
				System.out.println(inp / 3);
			} else if (inp == -1) {
				break;
			} // else if (inp % 3 != 0) { // 3의 배수가 아닌 경우
//			}
		}
		sc.close();
	}
}
