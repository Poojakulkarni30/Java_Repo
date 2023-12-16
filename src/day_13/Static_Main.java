package day_13;

public class Static_Main {

	public static void main(String[] args) {

      System.out.println(Static_Keyword.a); // static variable accessible in anthor class using classname.varname
			
        Static_Keyword.m1();                  // static method
			
// accessing non static method and variable using object
			
			Static_Keyword se=new Static_Keyword();
			System.out.println(se.b); // non static variable
			se.m2();                  // non static method
			
		}
	}


