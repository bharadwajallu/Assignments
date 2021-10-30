package assign_2;

public class emp{
	public int salary(int  amt) {
		System.out.println("Salary of the Employee is: "+amt);
		return amt;
	}
}
class manager extends emp{
	public int salary(int  amt) {
		System.out.println("Incentive of the Manager is: "+amt);
		return amt;
	}
}
class labour extends emp{
	public int salary(int  amt) {
		System.out.println("Over Time of the Labour is: "+amt);
		return amt;
	}
}