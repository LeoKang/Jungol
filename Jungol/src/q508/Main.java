package q508;

public class Main {
	public static void main(String[] args) {
		// 1st case
//		System.out.println("      item     count     price");
//		System.out.println("       pen        20       100");
//		System.out.println("      note         5        95");
//		System.out.println("    eraser       110        97");

		// 2nd case
		System.out.printf("%10s%10s%10s\n", "item", "count", "price");
		System.out.printf("%10s%10s%10s\n", "pen", "20", "100");
		System.out.printf("%10s%10s%10s\n", "note", "5", "95");
		System.out.printf("%10s%10s%10s\n", "eraser", "110", "97");

		// 3rd case
		System.out.printf("%10s%10s%10s", "item", "count", "price");
		System.out.printf("\n%10s%10s%10s", "pen", "20", "100");
		System.out.printf("\n%10s%10s%10s", "note", "5", "95");
		System.out.printf("\n%10s%10s%10s", "eraser", "110", "97");
	}
}
