package assign_2;

public class savingAccount extends Bank{
	private String name = "Saving Account";
	
	public void showTotal() {
		System.out.println("Your Fixed Deposits " + name + "balance is " +totalAmount);
	}

}
