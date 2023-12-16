package day_15;

public class Super_final extends Super_keyword {

	int a=45;
	
	void ree() {
		System.out.println("called a from parent: "+super.a);
	}
	
	public static void main(String[] args) {
		
		
		Super_final  test=new Super_final();
		test.ree();
         test.m1();
	}

}
