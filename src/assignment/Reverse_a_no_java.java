package assignment;

public class Reverse_a_no_java {

	public static void main(String[] args) {

		int number=1234;
		
		int rev=0;
		while(number!=0) {
			
			rev=rev*10+number%10;
			number=number/10;
		
		}
		
		
		System.out.println(rev);
		
		
		
		
		
		
	}

}
