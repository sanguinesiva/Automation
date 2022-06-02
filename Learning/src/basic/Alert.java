package basic;

import javax.swing.JOptionPane;

public class Alert {
	public static void main(String[] args) {
		Alert.alert("hello");
		
		}

	private static void alert(String mymessage) {
		JOptionPane.showMessageDialog(null, mymessage);
		
		
	}
	

}
