package basic;



public class SpectrumInterview {
	public static void main(String[] args) {
		int[] num= {2,7,9};
		int original= 4;
		boolean found;
		while(true) {
			found= false;
			for(int i=0 ; i<num.length; i++) {
				if( original==num[i]) {
					original *=2;
					found=true;
				}
			}
			
			
		}
	}

}
