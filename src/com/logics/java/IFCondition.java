package com.logics.java;

public class IFCondition {
	
	
	
	private static final CharSequence Monday = null;
	private static final String Wenusday = null;
	private static final String Tuesday = null;
	private static final String Thursday = null;
	private static final String Friday = null;

	public static void m1(int x ) {
		
	
		
		if(x%2 == 0) {
			System.out.println("The Number is even");
			
		}
		else {System.out.println("Number is odd");}
		
	
		}
	
	
	public static void m2() {
	       int  a = 10;
           int b = 20;
        
        if (a<b) {
     	   System.out.println("a is smaller number");
        }
        else {System.out.println("a is smaller number ");}
        
	}
	/* program to print the grade of student for marks he got ,
	 * Less than 35 is fail , 35 to 70 is Third class , 70-85 is second class , above 85 is first class)
	 */
/*-----------------------------------------------------------------------------------------------------------------------------
	-------------------------------------------------------------------------------------------------------------------------*/
	public static void m3(int marks) {
		
		
		if(marks >= 35) {
			
			if (marks>=35 && marks<=70) {
				System.out.println("Third Class");
			}
			else {
				if (marks>=70 && marks<=85) {
					System.out.println("Second Class");
				}
				
				else { System.out.println("First Class");
			}
					

			}
			
	}
		else { System.out.println("Fail");	}
	}
	
	
/*------------------------------------------------------------------------------------------------------------------------------
	------------------------------------------------------------------------------------------------------------------------*/
	
	
	public static void m4(String s) {
		
		String s1 = "Saturday";
		String s2 = "Sunday";
	    
		
		if (s.equalsIgnoreCase(s1)){
			
			if (s.equalsIgnoreCase(s2)) {
				
				System.out.println("Yay its weekend");
			}
		
		else {System.out.println("Uhh its a week day");}
		
		}
			
			
			
		
		System.out.println("Uff,its a weekday");
		
		}
		
	
	
	public static void main(String[] args) {
   
	
      m1(9);
		m3(70);
		m4("Sunday");
}
}
