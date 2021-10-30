package assign_3;

public class insert {

	public static void main(String[] args) {
		StringBuffer str = new StringBuffer("It is used to at  specified index position");
	        System.out.println("string = " + str);
	  
	       
	        str.insert(17, "insert text");
	        System.out.print("After insertion = ");
	        System.out.println(str.toString());

	}

}
