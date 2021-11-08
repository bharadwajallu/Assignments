package assign_9;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class thread {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,4,3,5,6,7,8,9);
		
		Consumer<List<Integer>>dispList = (list1) -> System.out.println(list1);;
		 
		Thread newthread = new Thread( ()-> dispList.accept(list) );
		
		newthread.start();
 	 
	}
  
}