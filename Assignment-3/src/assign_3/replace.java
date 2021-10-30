package assign_3;

import java.util.Scanner;

public class replace {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter  string");
		String line=in.nextLine();
		line=line.replace('a','$');
		System.out.println(line);
	}

}
