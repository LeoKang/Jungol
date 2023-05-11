package q534;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char c = str.charAt(0);
		sc.close();

		System.out.println(c);

		// 3rd case
		switch(str) {
		case "A":
			System.out.println("Excellent");
			break;
		case "B":
			System.out.println("Good");
			break;
		case "C":
			System.out.println("Usually");
			break;
		case "D":
			System.out.println("Effort");
			break;
		case "F":
			System.out.println("Failure");
			break;
		default:
			System.out.println("error");
			break;
		}
		
		// 2nd case
		switch(c) {
		case 'A':
			System.out.println("Excellent");
			break;
		case 'B':
			System.out.println("Good");
			break;
		case 'C':
			System.out.println("Usually");
			break;
		case 'D':
			System.out.println("Effort");
			break;
		case 'F':
			System.out.println("Failure");
			break;
		default:
			System.out.println("error");
			break;
		}
		
		// 1st case
		if (c == 'A') {
			System.out.println("Excellent");
		} else if (c == 'B') {
			System.out.println("Good");
		} else if (c == 'C') {
			System.out.println("Usually");
		} else if (c == 'D') {
			System.out.println("Effort");
		} else if (c == 'F') {
			System.out.println("Failure");
		} else {
			System.out.println("error");
		}
	}
}
