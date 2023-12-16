package day_09;

public class StringBuffer_StringBuilder {

	public static void main(String[] args) {

		// Reverse a string using StringBuffer class
		
		StringBuffer s1= new StringBuffer("welcome");
		System.out.println("Reverse a string by stringbuffer "+ s1.reverse());
		
		// Reverse a string using StringBuilder class
		
		StringBuilder s11= new StringBuilder("Jordan Ramsey");
		System.out.println("Reverse a string by StringBuilder "+ s11.reverse());
	}

}
