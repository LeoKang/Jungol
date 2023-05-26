package q599;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String inp = sc.next();
		sc.close();

//		System.out.println(inp);

		for (int i = 0; i < inp.length(); i++) {
			char c = inp.charAt(i);
//			System.out.println(c);
			if ('A' <= c && c <= 'Z') {
				// 알파벳 대문자
				System.out.print(c);
			} else if ('a' <= c && c <= 'z') {
				// 알파벳 소문자
				System.out.print((char) (c - 32));
				// 'A':65, 'a':97
			}
		}
	}
}
