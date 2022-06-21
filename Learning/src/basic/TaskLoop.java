package basic;
/*
 * Write a program which prints numbers from 1 to 30. 
 * After every third number, print “i am taking short break”.*/



public class TaskLoop {
	public static void main(String[] args) {
	
			int count = 1;
			for (int i = 1; i <=30; i++) {
				System.out.println(i);
			if (count== 5) {
				System.out.println("i am taking short break\b \b.");
				count=0;
				
					}
			count++;
			
			
			
		}
			/*
			 * Write a program which makes use of a loop to print the following output:

0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10.*/
			for (int i = 0; i <= 10; i++) {
			    System.out.print(i + ", ");
			}
			 
			System.out.println("\b\b.");
	}
	
}
