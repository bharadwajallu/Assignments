package assign_9;

import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;

public class uppercase {

	public static void main(String[] args) {
		 
		List<String> str = Arrays.asList("Bharadwaj", "sanju","allu");
		
		UnaryOperator<String> unaryOperator = (list) -> list.toUpperCase();
		
		str.replaceAll(l -> unaryOperator.apply(l));
		
		 System.out.println(str);
	}

}