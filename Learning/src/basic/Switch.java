package basic;

import java.util.Scanner;

public class Switch {
	public static void main(String[] args) {
		System.out.println("enter 1 or 2");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
	
		

		switch (num) {
		case 1:
			System.out.println("\nHello");

			break;

		case 2:
			System.out.println("hi");
			break;
		}

	}

}
