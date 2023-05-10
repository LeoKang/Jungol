package q595;

public class Main {
	public static void main(String[] args) {
		String str = "Hong Gil Dong";
		System.out.print(str.charAt(3));
		System.out.print(str.charAt(4));
		System.out.print(str.charAt(5));
		System.out.println(str.charAt(6));

		for (int i = 3; i < 7; i++) {
			System.out.print(str.charAt(i));
		}
		System.out.println();

		char[] carr = { 'H', 'o', 'n', 'g',
				' ', 'G', 'i', 'l', ' ', 'D', 'o', 'n', 'g' };

		for (int i = 0; i < carr.length; i++) {
			System.out.print(carr[i]);
		}
		System.out.println();

		for (int i = 3; i <= 6; i++) {
			System.out.print(carr[i]);
		}
	}
}
