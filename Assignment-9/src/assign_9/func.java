package assign_9;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class func {

	public static void main(String[] args) {
		 
		String[] str = {"Bharadwaj", "Allu","Sanju"};
		
		
		Supplier<String> supplier = ()-> Arrays.toString(str) ;        
		System.out.println(supplier.get());                            

		Consumer<String[]> consumer = (string) -> System.out.println(Arrays.toString(string));         
		consumer.accept(str);                                                                        

		Predicate<String[]> predicate = (string) -> Arrays.toString(string).contains("Bharadwaj");     
		System.out.println(predicate.test(str));                                                     
	
		Function<String[], String> function = (string) -> Arrays.toString(string);              
		System.out.println(function.apply(str));                                                  
		
	}
	

}