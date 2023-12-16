package day_02;

public class Ternary_Operator {

	public static void main(String[] args) {

		// var=exp?res1:res2;
		int a =100 , b=200;
		int z= a>b?a:b;
		System.out.println(z);
		
		int s=20;
		String f=(s>=18)?"eligible to vote":"Not eligible";
		System.out.println(f);
		
	}

}
