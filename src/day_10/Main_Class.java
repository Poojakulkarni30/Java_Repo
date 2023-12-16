package day_10;

public class Main_Class {

	public static void main(String[] args) {

		
		Employee e1= new Employee();
	    e1.employeeid=01;
	    e1.employeename="Pooja Kulkarni";
	    e1.Jobprofile="Software Test Engineer";
	    e1.salary=20000;
	
	    e1.display();
	    
	    
	    System.out.println();

		Employee e2= new Employee();
	    e2.employeeid=02;
	    e2.employeename="Jordan";
	    e2.Jobprofile="Angular developer";
	    e2.salary=25000;
	
	    e2.display();
		
	    
	    System.out.println();

		Employee e3= new Employee();
	    e3.employeeid=03;
	    e3.employeename="Ryan";
	    e3.Jobprofile="Developer";
	    e3.salary=30000;
	
	    e3.display();
		
	    
	    
		
	}

}
