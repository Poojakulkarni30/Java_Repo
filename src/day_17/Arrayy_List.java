package day_17;

import java.util.ArrayList;

public class Arrayy_List {
	
	public static void main(String[] args) {
		
	
	
	/*
	 *   main root interface is a  collection interface
	 *   then it got extended into two interface 1. list 2. list
	 *   1. list interface ---> list is a interface which contain all the methods and al
	 *   these methods we can implement through class. i.e. Arraylist class
	 *   arraylist points:
	 *   
	 *    1. It contains hetrogenous data that means all kind of data.
	 *    2. insertion order maintained by index
	 *    3. Duplicate elements allowed because we fetch through those values index
	 *    4. Multiple nulls allowed
	 *    5. ArrayList list = new ArrayList(0;
	 *         list.add(" " );
	 *
	 */
	// for homogenous data
	
//	ArrayList <Integer> list= new ArrayList<Integer>();
	
	
	        ArrayList listt = new ArrayList();
	     
          	// add data into arraylist
	             
	        listt.add('A');   // 0
	        listt.add("Pooja"); // 1
	        listt.add(100);     // 2
	        listt.add(null);    // 3
	        listt.add(true);    // 4
	        listt.add(null);    // 5
	        
	     //   System.out.println(listt.get(2)); // will get the vlaues on the basis of index number
	   //    listt.add(3, " value");
	    //    System.out.println(listt.get(3));
	 //     listt.remove(5);
	      System.out.println(listt);
	      System.out.println("Array list size is:"+listt.size());
	      
	      for(Object x: listt) {
	    	  System.out.println(x);
	      }

}
}
