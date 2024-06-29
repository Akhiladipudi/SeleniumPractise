package Methods;

public class CallbyValue {

	public int m1 (int x) {
		
		return x = x+100;
	}
	

	public static void main(String[] args) {
		
		int a = 10;
		
		CallbyValue c  = new CallbyValue();
   c.m1(a);		
		
		System.out.println(a);
		System.out.println(c.m1(a));
		System.out.println(a);
		
	}
		
		
		
	
		
		

	}


