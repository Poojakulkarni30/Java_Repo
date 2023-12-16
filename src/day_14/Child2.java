package day_14;

public class Child2 extends Inheritance_types{
	
	void child() {
		System.out.println("this is child 2");
	}

	public static void main(String[] args) {
		
		Child2 ch=new Child2();
		ch.m1();
		ch.m2(10, 30);
        ch.child();
	}

}
