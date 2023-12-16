package day_16;

public interface A {
	
	/*1. you can extends two interface but you have to implement in class using implements keyword
	2. interface only contain final and static variables.
	3. interface is a blueprint of class
	4. interface only consist abstract methods, static and final.
	*/
	

	int length=10; // final and static 
	int width=20;
	void circle();
	default void square() {
		System.out.println("square method");
	}
	static void rectangle() {
		System.out.println("rectangle method");
	}
}
