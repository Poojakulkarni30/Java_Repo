package day_06;

public class Find_odd_even_no {

	public static void main(String[] args) {

		int a[]= { 1,2,3};
		int oddno=0;
		int evenno=0;
	
		for(int i=0;i<a.length;i++) {
			
			if(a[i]%2==0) {
			evenno++;
			}
			else {
				oddno++;
			}
		
		}
		System.out.println("even no is: "+ evenno);
		System.out.println("odd no is: "+ oddno);
	}

}
