package day_11;

public class Constructor_types {
      
	int x=10;
	int y=20;
	String s="Welcome";
	
	// 1. default constructor
	
	Constructor_types(){  // will not accept any parameter
		
	
		
		System.out.println("this is default constructor");
	}
	 void displaydata() {
		 
		 System.out.println(x);
		 System.out.println(y);
		 System.out.println(s);
	 }
	 
	// 1. Parameterized constructor
	 
	 Constructor_types(int a, int b, String d){  // will not accept any parameter
			
			x=a;
			y=b;
			s=d;
			System.out.println();
			System.out.println("this is Parameterized constructor");
		}


	public static void main(String[] args) {
		
		Constructor_types rr =new Constructor_types();
		rr.displaydata();
     
		 Constructor_types r1= new 	 Constructor_types(100,200,"welcome");
		 r1.displaydata();
		
	}

}
