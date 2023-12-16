package day_03;

public class Nested_Ifelse {

	public static void main(String[] args) {

		int weekno = 125;
		if (weekno >= 1 && weekno <= 7) {
			if (weekno == 1) {
				System.out.println("Monday");
			} else if (weekno == 2) {
				System.out.println("Tuesday");
			} else if (weekno == 3) {
				System.out.println("Wedenesday");
			} else if (weekno == 4) {
                  System.out.println("Thursday");
			}
			else if(weekno==5) {
				System.out.println("Friday");
			}
			else if (weekno==6) {
				System.out.println("Saturday");
			}
			else if(weekno==7) {
				System.out.println("Sunday");
			}
		}
		else {
			System.out.println("Invalid number");
		}
	}

}
