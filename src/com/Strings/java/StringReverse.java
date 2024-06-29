package com.Strings.java;

public class StringReverse {
	
	public static void main(String[] args) {
	
	String s1= "Akhil is a good boy";
	
	int i;
	
	System.out.println(s1.length());
	
	for(i=s1.length()-1;i>=0;i--) {
		
		
		char x = s1.charAt(i);
		
		if (Character.isUpperCase(x)) {
		System.out.print(x);
	}
	
	
	}
}
}
	

