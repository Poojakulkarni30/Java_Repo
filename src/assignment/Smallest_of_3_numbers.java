package assignment;

public class Smallest_of_3_numbers {

	public static void main(String[] args) {

		int a=110, b=85, c=65;
		
		if(a<b && a<c) {
			System.out.println(" A is the smallest number :" + a);
		}
		else if(b<a && b<c) {
			
			System.out.println(" B is the smallest number :" + b );
			
		}
		else {
			System.out.println("  C is the smallest number :" + c);
		}
	}

}
