package basic;

import java.util.Scanner;
/*
Write a program with two int variables, int x and int y, and 
give each one a value. Depending on their values, print “x is bigger than y”, 
“x is smaller than y”, or “x and y are the same”. 
Change the values and run the program a few times to check it works.
*/

public class Logical {
	int x;
	int y;

	public static void main(String[] args) {

		System.out.println("enter x");
		try (Scanner sc = new Scanner(System.in)) {
			int x = sc.nextInt();
			System.out.println("enter y");
			int y = sc.nextInt();
			if (x > y) {
				System.out.println("value of x is greater than y");

			} else if (x < y) {
				System.out.println("value of y is greater than x");

			} else {
				System.out.println("both the numbers are same");

			}
		}

	}

}
