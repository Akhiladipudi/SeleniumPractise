package Methods;

public class CallbyValue1 {
	
	public int m1(int x ) {
		
		return x = x +10;
	}

	public static void main(String[] args) {
		
		int a = 20 ;
		
		CallbyValue1 cv1 = new CallbyValue1();
		
		System.out.println(a);
		System.out.println(cv1.m1(a));
		System.out.println(a);
		
		
		

	}

}
