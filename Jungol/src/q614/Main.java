package q614;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String school = sc.next();
		int grade = sc.nextInt();
		sc.close();

//		System.out.println(school + " " + grade);

		Student s1 = new Student("Jejuelementary", 6);
		Student s2 = new Student(school, grade);

		System.out.println(s1.grade + " grade in " + s1.school + " School");
		System.out.println(s2.grade + " grade in " + s2.school + " School");
	}
}
