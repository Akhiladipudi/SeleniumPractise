package com.Basics.Java;

public class Variables {
	
	   /* variables are used to store the data , we store reuse the data with the help of variables
	    * there are two types of variables Global variables and local variables 
	    * global variables are sub divided into instance and static variables /class variables
	    * local variable are the variables declared with in the method and also parameters are also called as local variables
	    * the difference between local variables and parameters is that the parameters can't be assigned with a value 
	    * Naming convention : variables are case sensitive , Akhil and akhil are different containers
	    */

     String PANCARD = "BKIPA0703K";//Instance variable
    static  float F = 10.5f; // class variables 
    
    public static void m1( int i ) { //Parameter
    	
    	System.out.println( "Score = " + i);
    	
    }
    
    // The above two are Global variables 
	public static void main(String[] args) {
		
		int x = 100;//local variables
		
		Variables v = new Variables();
		
		System.out.println(x);
		System.out.println(F);
		System.out.println(v.PANCARD);
		m1(450);
	}

}
