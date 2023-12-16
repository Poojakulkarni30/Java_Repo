package assignment;

import java.util.Scanner;

public class Count_Even_Odd_digitd_ScanneClass {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		int num = sc.nextInt();
		int oddcount = 0;
		int evencount = 0;
		while (num != 0) {

			int rem = num % 10;
			if (rem % 2 == 0) {
				evencount++;
			} else {
				oddcount++;
			}
			num = num / 10;
		}
		System.out.println("number of even count is:" + evencount);
		System.out.println("number of odd count is:" + oddcount);
	}

}
