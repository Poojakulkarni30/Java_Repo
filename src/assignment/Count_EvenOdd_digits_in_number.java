package assignment;

public class Count_EvenOdd_digits_in_number {

	public static void main(String[] args) {

		int num=1234567;
		int oddno=0;
		int evenno=0;
		while(num!=0) {
			int rem=num%10;
			if(rem%2==0) {
				evenno++;
			}
			else {
				oddno++;
			}
			num=num/10;
		}
		System.out.println("count of even no: "+ evenno);
		System.out.println("count of odd no: "+ oddno);
	}

}
