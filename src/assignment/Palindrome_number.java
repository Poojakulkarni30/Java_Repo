package assignment;

import java.util.Scanner;

public class Palindrome_number {

	public static void main(String[] args) {

	Scanner sc= new Scanner(System.in);
	
	System.out.println("Enter a number");
	int num = sc.nextInt();
	int orgnum=num;
	int rev=0;
	while (num!=0) {
		 rev =rev*10+num%10;
		num=num/10;
	}
		System.out.println(rev);
		
	
	if(rev==orgnum) {
		System.out.println("palindrome number");
	}
	else {
		System.out.println("not palindrome number");
	}
}
}
