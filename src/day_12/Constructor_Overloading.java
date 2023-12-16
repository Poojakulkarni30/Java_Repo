package day_12;

public class Constructor_Overloading {

	Constructor_Overloading(){
		System.out.println("Default Constructor");
	}

	Constructor_Overloading (int a, int b){
		System.out.println("Paramerized Constructor");
	}

	Constructor_Overloading(int a, double b){
		System.out.println(a);
		System.out.println(b);
	}
       
	Constructor_Overloading( double a, int b){
		System.out.println(a);
		System.out.println(b);
	}

	
	
	public static void main(String[] args) {
	
		Constructor_Overloading obj =new Constructor_Overloading();
		Constructor_Overloading obj1 =new Constructor_Overloading(10,20);
		Constructor_Overloading obj2 =new Constructor_Overloading(10,20.5);
		Constructor_Overloading obj3 =new Constructor_Overloading(17.5,55);
	}

}
