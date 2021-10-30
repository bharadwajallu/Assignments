package assign_2;

public class Bank {
	private String name="BANK";
	int totalAmount;
	
	public void addToTotalBankCash(Bank obj) {
	totalAmount +=obj.totalAmount;
	}
	public void showTotal() {
		System.out.println("The total cash in " +name +"is"+totalAmount);
	}
	public void addAmt(int amt) {
		totalAmount += amt;
	}
	
}
