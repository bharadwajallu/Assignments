package assign_2;

public class sal {

	public static void main(String[] args) {
		int total=0;
		emp a= new emp();
		total+=a.salary(15000);
		a=new manager();
		total+=a.salary(25000);
		a=new labour();
		total+=a.salary(5000);
		System.out.println("Total salary of the Employee's is : "+total);

	}

}
