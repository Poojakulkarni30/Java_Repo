package day_17;

import java.util.HashSet;

public class Hashh_Set {

	public static void main(String[] args) {

		/*
		 *     Hashset is a interface which contain all the method and all these method will implemented
		 *     with set class 
		 *     
		 *     1. hetrogenous data allowed
		 *     2. insertion order not maintained
		 *     3. duplicate values not allowed
		 *     4. only single null value allowed
		 *     5. we can insert any particular location as index not maintained
		 */
		
		
		HashSet sett=new HashSet();
		
		sett.add("sen");
		sett.add(null);
		sett.add(100);
		sett.add('A');
		sett.add(true);
		
		System.out.println("Size: "+sett.size());// size of set
		sett.remove("sen");
		System.out.println("after remove set: "+sett);
		
		for(Object x:sett) {
			System.out.println(x);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
