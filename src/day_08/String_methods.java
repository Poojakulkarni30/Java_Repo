package day_08;

public class String_methods {

	public static void main(String[] args) {

		String str = "Welcome"; // 0=w 1=e 2=l 3=c 4=o 5=m 6=e
		String str1 = "welcome";
		String str2 = " and automation";

		System.out.println("Printing just string:" + str);

		// calculate the length of the string

		System.out.println("the length of the string is: " + str.length());

		// concat method to joint the string

		System.out.println(str.concat(str1));

		// concat 3 strings

		System.out.println("After concatation of 3 strings: " + str.concat(str1).concat(str2));

		// trim(); it will trim left and right blank spaces

		String trims = "  abc  ";

		System.out.println("trim the left and right spaces: " + trims.trim());

		// charAt method= it will print the character based on index number. index
		// always start from zero

		System.out.println("Print the character based on index value: " + str.charAt(4)); //

// 5. Contains() --- this will return true or false based on if the main string contains given value

		System.out.println("if str contains trims then will return true or false: " + str.contains(trims));

		// 6. equals()--- this is case sensitive it will check if the value equals or not

		System.out.println("return true if both values are equal: " + str.equals(str1));

		// 7. equalsingonrecase()-case insensitive - it will ignore the case 
		
		System.out.println("return true if both values are equal, it will ignore the case: " +str.equalsIgnoreCase(str1));
		
	//8. replace- it will replace the old character with new one 
		
		System.out.println("will replace old with new char: "+ str.replace('W', 'X'));
		
	//9. Substring -- it will cut a string for start of string index will start from zero
		           // for ending string it will start from 1
		String test= "Selenium";  //0-s 
		System.out.println("string will cut from 3rd index: "+test.substring(3));
		System.out.println("give starting and ending index: "+ test.substring(4, 8));
		
	//10. ToUppercase();-- convert lower to upper
		
	String s= "testng";
	System.out.println("Conver to uppercase: "+ s.toUpperCase());
	
	//11. ToLowercase();-- convert  upper to lower
	
	String s1= "TestNG";
	System.out.println("Conver to uppercase: "+ s1.toLowerCase());
	
	
	//12. Split() method - it will split the string. it will work based on delimeter given
	
	String sr="abc@gmail.com";
	
	System.out.println(sr.split("@"));
	//after splinting it will give string so we have to store into array
		//otherwise it will random data
		String x[]=sr.split("@");
		System.out.println("after spliting give array index number: "+x[0]);
	}

}
