package day_06;

public class Print_odd_even_numbers {

	public static void main(String[] args) {

		int a[]= { 1,2,3,4,5,6,8};
		
		for(int i=0; i<a.length;i++) {
			
			if(a[i]%2==0) {
				System.out.println("even numbers is:"+a[i]);
			}
			if(a[i]%2==1) {
				System.out.println("odd numbers is:"+a[i]);
			}
		}
	}

}
