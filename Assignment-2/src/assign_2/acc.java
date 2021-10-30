package assign_2;

public class acc {

	public static void main(String[] args) {
		Bank newBank = new Bank();
		newBank.showTotal();
		
		Bank savingAc = new savingAccount();
		savingAc.addAmt(10000);
		Bank current = new currentAccount();
		current.addAmt(20000);
		
		newBank.addToTotalBankCash(current);
		newBank.addToTotalBankCash(savingAc);
		
		current.showTotal();
		savingAc.showTotal();
	}

}
