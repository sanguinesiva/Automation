package basic;

public class Static {
int x;
static int y;

void incrementalwork() {
	x++;
	y++;
	System.out.println("x:"+ x +" & "+"y: "+y);
	
}
public static void main(String[] args) {
	Static s = new Static();
	s.incrementalwork();
	s.incrementalwork();
	s.incrementalwork();
	s.incrementalwork();
	Static s1 = new Static();
	s1.incrementalwork();
}
}
