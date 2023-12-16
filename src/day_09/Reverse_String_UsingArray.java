package day_09;

public class Reverse_String_UsingArray {

	public static void main(String[] args) {

		String s="Welcome to java";
		
		String rev="";
		for(int i=s.length()-1;i>0;i--) {
			
			char c[]= s.toCharArray();
			rev=rev+c[i];
		}
		
		
		System.out.println(rev);
	}

}
