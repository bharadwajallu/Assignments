package assign_j11;

import java.util.Arrays;
import java.util.List;

public class ListToString {

	public static void main(String[] args) {
		 
		List<String> str = Arrays.asList("My","name","is","Bharadwaj","Allu",".");
		System.out.println(str);
		str.toArray();
		str.forEach(l -> System.out.print(l + " "));
 	}

}