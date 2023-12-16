package day_09;

public class Equalsto_DoubleEqualsto {

	public static void main(String[] args) {

		String s="welcome";
		String s1="welcome";
		System.out.println(s.equals(s1));// true
		System.out.println(s==s1); // true
	// The main point concerns when user create object with new keyword because it will points to
	//	2 different locations in the memory
		
		String str=new String("welcome");
		String str1=new String("welcome");
		System.out.println(str==str1);  // == compare two objects because of new keyword. new keyword is used tocreate new objects
		System.out.println(str.equals(str1)); // this will return true as it will comapare values present in objects
		
	}

}
