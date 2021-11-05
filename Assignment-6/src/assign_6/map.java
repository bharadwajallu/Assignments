package assign_6;

import java.util.Collections;
import java.util.Map;

import java.util.TreeMap;

public class map {

	public static void main(String[] args) {
		 
		contact obj1 = new contact( 9999999999L, "Allu" , "allu@gmail.com" , "Male");
		contact obj2 = new contact( 8888888888L, "Bharadwaj" , "bharadwaj@gmail.com" , "Male");
		contact obj3 = new contact( 1010101010L, "Sanju" , "sanju@gmail.com" , "Male");

		Map<Long, contact> data = new TreeMap<Long, contact>(Collections.reverseOrder());
		
		
		data.put(123L, obj1);
		data.put(1234L, obj2);
		data.put(12335L, obj3);
	 	 
		 System.out.println("Keys : "+data.keySet() + "\n");
		 System.out.println("Values : " + data.values() + "\n");
		 System.out.println(data + "\n");
		 
	}

}
