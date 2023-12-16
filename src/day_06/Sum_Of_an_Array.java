package day_06;

public class Sum_Of_an_Array {

	public static void main(String[] args) {

		int a[]= { 1,2,3,1,2,1};
		int sum=0;
	
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
			
		}
		System.out.println("The sum of all elements is: "+sum);

		
	}

}
