package assignment;

import java.util.Scanner;

public class Count_no_of_digits_ScannerClass {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		System.out.println("enter a number");
		int num=sc.nextInt();
		int count=0;
		
		while(num!=0) {
			num=num/10;
			count++;
		}
		System.out.println("The count is : "+count);
	}

}
