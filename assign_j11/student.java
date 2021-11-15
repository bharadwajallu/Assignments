package assign_j11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;

public class student {
	
public static void main(String[] args) throws IOException {
		
		var path = "C:\\Users\\BHALLU\\eclipse-workspace\\Assignment-10\\src\\assign_j11\\studentList.txt";
		
		 List<String> str = Files.readAllLines(Path.of(path));
		 
		  long count =   str.stream().filter(l -> !(l.isBlank())).count();
		 System.out.println(str.stream().filter(l -> !(l.isBlank())).
				 map(l-> l.strip()).collect(Collectors.toList()) + 
				 "\nThere are " +count + " Students");
		 
	}


}