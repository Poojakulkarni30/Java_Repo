package day_12;

public class Method_Overloading {
	
	int a;
	int b;
	double c;
	void m1() {
		
	int a =10;
	int b=30;
	 System.out.println("Method 1: " +(a+b));
	}
	
	void m1(int a, int b) {
	
	this.a=a;
	this.b=b;
	System.out.println("Method 2: " +(a+b));
	
	}
	
	
	void m1( int a, double c) {
		
	this.a=a;
	this.c=c;
	System.out.println("Method 3: "+(a+c));
		
		}

	void m1(double c, int a) {
	
	this.a=a;
	this.c=c;
	System.out.println("Method 4: "+(a+c));
		
		}

	public static void main(String[] args) {
		
		Method_Overloading cc = new Method_Overloading();
		
		cc.m1();
		cc.m1(10, 20);
		cc.m1(105, 45.56);
		cc.m1(10.5, 45);
		
	}

}
