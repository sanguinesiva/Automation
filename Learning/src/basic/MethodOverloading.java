package basic;

public class MethodOverloading {
	public static void main(String[] args) {
		MethodOverloading mol = new MethodOverloading();
		mol.callByName("siva");
		
		mol.callByNumber(987654321 );
		
		
	}
	public void callByNumber(int phone_no) {
		System.out.println("cell_phone_number "+ phone_no);
		
		
	}
	public void callByName(String name) {
		System.out.println("contact_name "+ name);
	}

		
	}


