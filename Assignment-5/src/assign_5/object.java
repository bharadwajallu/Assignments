package assign_5;

public class object {

	public static void main(String[] args) {
		 
		pair<String, String> obj1 = new pair<String, String>("1", "Hello");
		pair<String, java.util.Date> obj2 = new pair<>("Today is :", new java.util.Date());

		System.out.println(obj1.showData());
		System.out.println(obj2.showData());
		
	}

}