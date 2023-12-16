package day_12;

public class Encapsulation_Main {

	public static void main(String[] args) {

		Encapsulation enc =new Encapsulation();
		enc.setstudentid(101);
		enc.setSname("Pooja");
		enc.setstudentage(26);
		
		System.out.println("Student name is: "+enc.getSname());
		System.out.println("Student id is: "+ enc.getstudentid());
		System.out.println("Student age is: "+enc.getstudentage(26));
	}

}
