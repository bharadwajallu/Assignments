package assign_2;

public class currentAccount extends Bank{
	private String name = "current Account";
	
	public void showTotal() {
		System.out.println("The cash credits of" + name + " is "+totalAmount);
	}

}
