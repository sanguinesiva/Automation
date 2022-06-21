package basic;

import java.util.concurrent.ThreadLocalRandom;

public class DoWhile {

	public static void main(String[] args) {
		
		int i = 0;
		do {
			int x= ThreadLocalRandom.current().nextInt(1, 10);
			System.out.println(x);
			
		} while (i>3);
			
	
	}

}
