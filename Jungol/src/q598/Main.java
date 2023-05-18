package q598;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			String str = sc.next();
			char c = str.charAt(0);

			// 2.
			if (Character.isAlphabetic(c)) {
				System.out.println(c);
			} else if (Character.isDigit(c)) {
				System.out.println((int) c);
			} else {
				break;
			}

			// 1.
//			if ('A' <= c && c <= 'Z') { // 대문자
//				System.out.println(c);
//			} else if ('a' <= c && c <= 'z') { // 소문자
//				System.out.println(c);
//			} else if ('0' <= c && c <= '9') { // 숫자
//				System.out.println((int) c);
//			} else {
//				break;
//			}
		}
		sc.close();
	}
}
