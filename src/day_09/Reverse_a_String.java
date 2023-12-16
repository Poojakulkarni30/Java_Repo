package day_09;

public class Reverse_a_String {

	public static void main(String[] args) {
		
		
		String s="welcome to java";
		
		String rev="";
		for (int i=s.length()-1;i>0;i--) {
			rev=rev+s.charAt(i);
		}
		System.out.println("reverse string is: "+rev);
		
		
		
		
		
		
		

	}

}
