package basic;

public class MethodTypes {
	String activityString;
	
	// when static keywork is used in a method, we can call that method with out any object creation.
	
	
	public static void iamSleeping() {
		String siva= "he was sleeping all night";
		System.out.println(siva);
			}
	public static void main(String[] args) {
		MethodTypes.iamSleeping();
		MethodTypes mt = new MethodTypes();
		mt.iamWorking();
		mt.iamprograming();
		
	}
	// accessmodifier is private in this method so we can access this method only with in this class.
	private void iamWorking() {
		String siva= "he was working all the day";
		System.out.println(siva);
		
	}
	// when you dont use void key work which means you need to define the return type, example in this case its String.
	public String iamprograming() {
		String siva= "he was learing to program and also he was coding all day";
		System.out.println(siva);
		return siva;
	
	}
	

}
