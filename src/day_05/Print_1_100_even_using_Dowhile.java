package day_05;

public class Print_1_100_even_using_Dowhile {

	public static void main(String[] args) {

		int i=1;
		do {
			if(i%2==0)
			System.out.println(i);
			i++;
		}
		while(i<=100);
	}

}
