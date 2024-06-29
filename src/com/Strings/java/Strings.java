package com.Strings.java;
import java.util.Arrays;

public class Strings {
	
 static 	String Name = ("sravs");
 static String emailid = ("akhilsharma7992@gmail.com");
static String content = ( "Hi My Name is Akhil I am from hyderabad and I work as a test engineer");
	public static void main(String[] args) {
		
		System.out.println(Name + content);
		System.out.println(emailid);
		
		String S1 = new String("Sravs");
		System.out.println(S1);
		
		/* There are two ways to create a string one is with creating the obj and other is directing without crating an obj.
		 * If we directly assign values that values are stored in string pool and if we create a obj then the memory will be allocated in heap memory
		 * The strings created with obj and with obj both are not same 
		 */
		
		System.out.println(S1== Name); // This compares the address of the strings
		System.out.println(S1.equalsIgnoreCase(Name));
		
	/*System.out.println(content.contains(" work as a test engineer"));
	System.out.println(Name.indexOf('v'));//-1 index will come the given index is mor than the character limit
	System.out.println(Name.lastIndexOf('s'));
	System.out.println(content.split(Name, 2));
	*/
	System.out.println(emailid.substring(10, 20));
	System.out.println(Arrays.toString(content.split(" ")));
	System.out.println(Name.replaceFirst("sravs", "sravathi"));
		
		
	}
	

}
