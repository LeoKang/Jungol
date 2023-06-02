package q600;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String inp = sc.nextLine();
		sc.close();

//		System.out.println(inp);

		// 2nd : StringTokenizer -----------------------------------
		StringTokenizer st = new StringTokenizer(inp);
		int n = st.countTokens();
		System.out.println(n);

		while (st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println(token);
		}

		// 1st -----------------------------------
//		int cnt = 1;
//		for (int i = 0; i < inp.length(); i++) {
//			if (inp.charAt(i) == ' ') {
//				cnt++;
//			}
//		}
//		System.out.println(cnt);
	}
}
