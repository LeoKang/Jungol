package q556;

public class Main {
	public static void main(String[] args) {
		int[] sa = new int[10];
		for (int i = 0; i < 10; i++) {
			sa[i] = i + 1;

			System.out.printf("%d", sa[i]);
			if (i < sa.length - 1) {
				System.out.printf("?");
			}
		}
	}
}