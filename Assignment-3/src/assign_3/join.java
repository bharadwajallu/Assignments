package assign_3;

import java.util.Scanner;

public class join {

	public static void main(String[] args) {
		String s1,s2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter  string 1=");
		s1=sc.nextLine();
		System.out.println("Enter  string 2=");
		s2=sc.nextLine();
		System.out.println("Concatenated String is:");
		System.out.println(s1.concat(s2));
	}

}
