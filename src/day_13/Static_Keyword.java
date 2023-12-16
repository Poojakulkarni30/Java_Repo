package day_13;

public class Static_Keyword {
	
	/*  Rules 
	 
	 1. Static variables and keyword can access anywhere without object creation
	 2. Non static method can access Static variables and method directly
	 3. If your are using static variable and method in anthor class you have use classname.variable name
	     classname.method name
	 */

	static int a =10;
	int b=20;
	
	public static void m1() {
		
		System.out.println("This is static method m1");
		
	}
	
	public void m2() {
		
	 	System.out.println(a);
		System.out.println(b);
		m1();
	  ////  Non static method can access static method variables directly without object creation 
		System.out.println("This is a non static method");
	}
	
	/*public static void main(String[] args) {

		
		System.out.println(a); // static variable
		m1();                  // static method
		
		// accessing non static method and variable using object
		
		Static_Keyword se=new Static_Keyword();
		System.out.println(se.b); // non static variable
		se.m2();                  // non static method
		
	}
*/
}
