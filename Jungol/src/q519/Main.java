package q519;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		// case2. BufferedReader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		String s1 = st.nextToken();
		String s2 = st.nextToken();
		String s3 = st.nextToken();
		String s4 = st.nextToken();
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);

				
		// case1. Scanner 
//		Scanner sc = new Scanner(System.in);
//		int n1 = sc.nextInt();
//		int n2 = sc.nextInt();
//		sc.close();

//		n1 = n1 + 100; // n1 += 100;
//		n2 = n2 % 10; // n2 %= 10;
//
//		System.out.print(n1 + " ");
//		System.out.println(n2);
	}
}
