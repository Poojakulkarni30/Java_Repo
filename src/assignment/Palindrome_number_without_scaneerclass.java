package assignment;

public class Palindrome_number_without_scaneerclass {

	public static void main(String[] args) {

		int num=121;
		int orgnum=num;
		int rev=0;
		while (num!=0) {
			
			rev=rev*10+num%10;
              num=num/10;   
		}
		System.out.println(rev);
		
		if(rev==orgnum) {
			System.out.println("Palindrome number");
		}
		else {
			
			System.out.println("not palindrome number");
		}
	}

}
