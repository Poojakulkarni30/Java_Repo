package day_17;

import java.util.HashMap;
import java.util.Map;

public class Hashh_Map {
	
	/*    HASHMAP--->
	 *    1.  hashmap insertionorder not maintained
	 *    2. we save value in set of key and value
	 *    3. key should be unique
	 *    4. values can be duplicated
	 */
	
	

	public static void main(String[] args) {

	//	HashMap mapp=new HashMap();
		
	//   Map mapp= new HashMap();
	   
	   HashMap  <Integer,String> mapp =new HashMap<Integer,String>();
	   
		   mapp.put(101, "Pooja");
		   mapp.put(102, "Scott");
		   mapp.put(103, "nill");
		   mapp.put(104, "Jason");
		   mapp.put(105, "rome");
		   
		   System.out.println(mapp.size());
		   System.out.println(mapp);
		   mapp.remove(105);    // for remove just mention key 
		   System.out.println(mapp);
		   System.out.println(" Key 103 value: "+mapp.get(103)); // get particular value
		
		   
		   System.out.println(mapp.keySet());
		   
		
		   for(Object x:mapp.keySet()) {
				System.out.println(x + " " +mapp.get(x));
			}
		
		mapp.clear();
		System.out.println(mapp);
		
	}

}
