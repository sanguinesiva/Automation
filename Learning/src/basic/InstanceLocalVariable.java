package basic;

public class InstanceLocalVariable {
	int g=7;
	int f= 9;
	// use this key word to refer instance variable, other than local variable. 
	// if not by default java will take local variable. 
	

	public void localNumber(int a, int b) {
		int g = 5;
		System.out.println("sum of the no is:  "+b+this.g);
		System.out.println("sum of the num is:  "+(a+b+g));
		
		
		}
	public void localNumber2(int c, int d) {
		System.out.println("sum of the no is: "+ c+d);
		System.out.println("sum of the no is "+ (c+d+f));
		
	}
	public static void main(String[] args) {
		InstanceLocalVariable ILV = new InstanceLocalVariable();
		ILV.localNumber(10, 20);
		ILV.localNumber2(5, 5);
	}
	
	
}

