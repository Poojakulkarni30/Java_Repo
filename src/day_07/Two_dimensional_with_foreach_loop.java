package day_07;

public class Two_dimensional_with_foreach_loop {

	public static void main(String[] args) {
		int a[][]= {{10,20},{30,40},{50,60}};
				
		for (int x[]:a) {
			for(int y:x) {
				System.out.print(y+ " ");
			}
		System.out.println();
		
		}

		
	}

}
