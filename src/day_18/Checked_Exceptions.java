package day_18;

public class Checked_Exceptions {

	// if the exception found then only catch block will execute
	//   finally block will always execute either exception found or not
	public static void main(String[] args) {

		int i=2;
		
	try {
		int x= i/0;
	}
	catch(Exception e) {
		System.out.println("Exception found"+e);
		
	}
	
	finally {
		System.out.println("finally block will always execute either exception found or not");
	}
	
	
	}

}
