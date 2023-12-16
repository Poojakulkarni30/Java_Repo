package day_16;

public class Interface_demo implements A {
	
	void triangle() {
		System.out.println("this is triangle method");
	}
public void circle() {  // you have to use public when impement abstract method in class
	
	System.out.println("this is circle");
}
	public static void main(String[] args) {
		
		Interface_demo obj=new Interface_demo();
		obj.circle();
		obj.square();
		obj.triangle();
		System.out.println(A.length);
		System.out.println(A.width);
		A.rectangle(); // static method interface.methodname or interfacename.variablename

		
	}

}
