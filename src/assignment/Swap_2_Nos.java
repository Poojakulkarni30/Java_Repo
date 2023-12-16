package assignment;

public class Swap_2_Nos {

	public static void main(String[] args) {

		int a =10;
		int b=20;
		int x=5;
		int y=6;
      // by using 3rd variable 
		int temp=a; // temp =10; a=?
		a=b; // b=10
		b=temp;
		System.out.println("value of a " +a);
		System.out.println(" value of b " +b);
		// without using 3rd variable
		
		x=x+y; //  x = 11
		y=x-y; // 11-6=5 y=5
		x=x-y; // 11-5 =6
		System.out.println("value of x : " +x);
		System.out.println("value of y : " +y);
	}

}
