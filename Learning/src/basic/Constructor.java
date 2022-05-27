package basic;

public class Constructor {  
	int number;
	String name;
	double num1;
	short value;
	float x;
	boolean b;
	long L;
	byte by;
	

	
public Constructor(int number) {
	this.number= number;
	
System.out.println("double is: "+ num1);
System.out.println("String is: "+ name);
System.out.println("Int is: "+ number);
System.out.println("Short is: "+value);
System.out.println("Float is: "+ x);
System.out.println("Boolean is: " +b);
System.out.println("long is: "+ L);
System.out.println("byte is "+ by);

	
}
void display() {
	
}
public static void main(String[] args) {
	Constructor c = new Constructor(100);
	c.display();
	Constructor c1 = new Constructor(200);
	c1.display();

}
}
