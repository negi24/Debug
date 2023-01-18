package abc;

public class Debug2 {

	public static void main(String[] args) {
		System.out.println("START");
		int a=10;																	 //ctrl+shift+B // F11 debugging
		a= a++ + ++a - ++a + a++;
		if(a>55) {                                                                    // Right click and then inspect (ctrl+shift+I)
			System.out.println("Valid");
		}
		else {
			System.out.println("Invalid");
		}
		System.out.println("done");
		
		// TODO Auto-generated method stub

	}

}
