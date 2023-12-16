package day_06;

import java.util.Arrays;

public class SingleDimensional_Array {

	public static void main(String[] args) {

/* array is a collection of homogeneous elements. it contains data of only single type
	if you still want to add data of all data type then use object type array
	There are two types of array
	1. single dimensional array
	2. two dimensional array
	 */
		
		//how to declare an array
		
	 // there are two ways to declare an array
//		 int firstway []=new int [5]; // 5 is the siz of an array
//		 firstway[0]=1; 
//		 firstway[1]=2; // declaration
//		 firstway[2]=3;
//		 firstway[3]=4;
//		 firstway[4]=5;
//		 
//		 System.out.println(" the value of third index is: "+firstway[3]);
//		 
//		 for (int i=0;i<=4;i++) {
//			 
//			 System.out.print(firstway[i] + "  ");
//			
//		 }
//		 System.out.println();
		
		 // second way 
		 int secondway []= {1,2,3,4,5};
		 
		System.out.println("Length of an array: " + secondway.length);
		 
		System.out.println("Length of an array: " + Arrays.toString(secondway));
		
		
	}


}
