package basic;

import java.util.Scanner;

public class Condition {
	public static void main(String[] args) {
		System.out.println("enter your age\n:");
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		System.out.println("are you boy? yes/no/gay");
		String gender = sc.next();

		if (age >= 18 && gender.equals("yes")) {
			System.out.println("you are allowed to enter the club");
		} else if (gender.equals("gay")) {
			System.out.println("get inside");

		}

		else {
			System.out.println("just f**k off");
		}
	}

}
