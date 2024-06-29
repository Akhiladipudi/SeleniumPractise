package com.Basics.Java;

public class Operators {
	
	static int v;

	/*operators are used to perform operations on the variables
	 * Different types of operators are 
	       1. Arithmetic operators : +,-,*,/,%
	       2.Unary operators : ++,--
	       3.Relational operators : ==,!=,>,<,>=,<=
	       4.Conditional operators : &&, ||
	       5.Assignment operatoes : = , +=, -=, *= , /= ,%= 
	       


	 */
	
	static void arthematic() {
		
		int a = 10;
		int b = 20;
				System.out.println(a+b);
				System.out.println(a-b);
				System.out.println(a/b);
				System.out.println(a%b);
				System.out.println(a/b);
				System.out.println(b/a);

	}
	
	static void  unary()
	{
		int i=10;
		System.out.println(i);
		System.out.println(++i);
		System.out.println(i++);
		System.out.println(i--);
		System.out.println(i);
	}
	
	static void Relational() {
		int i = 2;
		int j=3;
		System.out.println(i<j);
		System.out.println(i==j);

		
	}
	
	static void Conditional() {
	int i = 30;
	int j = 40;
	
	System.out.println(i<j && i>j);
	System.out.println(i>j&& i!=j);
	System.out.println(i<j && i!=j);
	System.out.println(i==j && i>j);
	
	System.out.println(i<j || i>j);
	System.out.println(i>j || i!=j);
	System.out.println(i<j || i!=j);
	System.out.println(i==j || i>j);
	
	
	/* for && - True and True condition then result is true and rest all are flase (Logical AND)
	 * for || - false and false condition is false and rest all are true (Logical OR)
	 */
	
	}

	
  static void Assignment() {
	  
	  int i=1;
	  
	  System.out.println(i += 5 );
	  System.out.println(i -= 5);
	  System.out.println(i *=5);
	  System.out.println(i %= 5);
	  System.out.println(i /= 5);



  }
	//Note - Ctril +i for indentation to look script good

	public static void main(String[] args) {

		//arthematic();
		//unary();
		//Relational();
	//	Conditional();
		Assignment();
		System.out.println(v);

	}

}
