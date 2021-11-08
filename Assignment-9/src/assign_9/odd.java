package assign_9;

import java.util.ArrayList;
import java.util.List;

public class odd {

	public static void main(String[] args) {
		
			List<String> str = new ArrayList<>();
			
			str.add("bharadwaj");
			str.add("allu");
			str.add("aporva kanchi");
			str.add("Maneesha anna");
			
			str.removeIf(l -> l.length()%2 !=0);
			
			System.out.println(str);
			
	}

}