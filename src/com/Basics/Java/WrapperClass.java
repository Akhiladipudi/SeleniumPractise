package com.Basics.Java;

public class WrapperClass {

	public static void main(String[] args) {
		/*Java is not 100% object oriented because of the primitive data types
		we use data types to store data and creating an object to store data is waste of space hence we use primitive data types
		We cannot use primitive data types in any of the collections or data structures hence we use wrapper classes.
		here a class wrap the primitive data types
		
		Boxing - converting datype to wrapper class obj;
		unboxing - converting wrapper class obj to data type;
		
		int - Integer
		byte -Byte
		short -Short
		long -Long
		char - Char
		boolean - Boolean
		double-Double
		float-Float
		*/
		
		int i = 20;
		WrapperClass wc = new WrapperClass();
		
		Integer i1 = Integer.valueOf(i);//Boxing 
		Integer i2 = Integer.valueOf(100);//Auto-Boxing 
		System.out.println(i1);
		System.out.println(i2);

		
		Float f = Float.valueOf(100.5f);
		float f1 = f.floatValue();//Unboxing
		float f2= f;//Autounboxing
		System.out.println(f1);
		System.out.println(f2);
		
		// Conversion of string to integer
		
		String Name = "1234";
		int i3 = Integer.valueOf(Name);
		long l1 = Long.parseLong("1234");
		System.out.println(i3);
		
				
	}

}
