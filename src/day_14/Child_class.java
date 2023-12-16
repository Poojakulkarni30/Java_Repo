package day_14;

public class Child_class extends Inheritance_types{
	
	void m3() {
		System.out.println("This is the child class");
	}
	
	void m4() {
		System.out.println("this is 2nd child class method");
	}

	public static void main(String[] args) {
		
		Child_class ecc= new Child_class();
		ecc.m1();
		ecc.m2(10, 20);
		ecc.m3();
		ecc.m4();
		

	}

}
