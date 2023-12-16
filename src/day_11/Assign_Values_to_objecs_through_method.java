package day_11;

public class Assign_Values_to_objecs_through_method {

	public static void main(String[] args) {
		
		// Approach -02 assign values to objects through method 

		Student_Class s1= new Student_Class();
	    Student_Class s2= new Student_Class();
	    Student_Class s3= new Student_Class();
	    
	    
	    s1.setdata(01, "Pooja", 'A');
		s2.setdata(02, "Priya", 'B');
		s3.setdata(03, "Ganesh", 'C');
		s1.studentdata();
		System.out.println();
		s2.studentdata();
		System.out.println();
		s3.studentdata();
	}

}
