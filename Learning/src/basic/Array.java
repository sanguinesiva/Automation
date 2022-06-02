package basic;

import java.util.Arrays;

public class Array {
	public static void main(String[] args) {
		String[] fruits = { "apple", "banana", "grapes", "orrange", "pineapple", "guava", "cherry", "blueberry",
				"straberry" };
		System.out.println(Arrays.toString(fruits));
		System.out.println(fruits.length);
		System.out.println(fruits);
		System.out.println(fruits[1]);
		System.out.println(fruits.length - 2);

		int[] a = new int[11];
		a[0] = 100;
		a[1] = 200;
		a[2] = 300;
		a[3] = 400;
		a[10] = 899;
		System.out.println(a);
		System.out.println(Arrays.toString(a));

	}

}
