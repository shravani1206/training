package Stock;

public class stockmanagement {
	public static void main(String args[]) {
		
		buyer b=stocksinglton.getstock();
		seller s1=stocksinglton.getstock();
		broker b1=stocksinglton.getstock();
		 b.get();
	        b1.view();
	        s1.get();
	        System.out.println(s1==b1);
		
	}

	
	
	
}
