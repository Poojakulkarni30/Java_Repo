package day_13;

public class This_Keyword {
	
	int a;
	int b;
	
	void thiskeyword(int a,int b) {
		this.a=a;
		this.b=b;
		
		System.out.println("Print addition of a and b is: "+(a+b));
		
	}

	public static void main(String[] args) {
		
		This_Keyword dev= new This_Keyword();
		dev.thiskeyword(10, 20);

	}

}
