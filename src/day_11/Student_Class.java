package day_11;

public class Student_Class {

	int sid;
	String sname;
	char grade;
	
	public void studentdata() {
		
		System.out.println("The student Roll number is: "+sid);
		System.out.println("      Name : "+sname);
		System.out.println("      Grade : "+grade);
		
	}
	
	// assign data to objects through methods 
		public void setdata(int id, String name, char gradee) {
			
			sid=id;
			sname=name;
			grade=gradee;
		}	
			// assign data to objects through Constructor  
			/*
			Student_Class(int id1, String name1, char gradee1){
				
				sid=id1;
				sname=name1;
				grade=gradee1;
			}	
				*/

			
		}
		
		

	
	
	
