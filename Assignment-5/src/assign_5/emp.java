package assign_5;

import java.util.HashSet;
import java.util.Iterator;

public class emp {

	public static void main(String[] args) {
		
		Employee a1 = new Employee(12345, "Bharadwaj", 10000);
		Employee a2 = new Employee(12346, "Allu", 20000);
		
		HashSet<Employee> empDetails = new HashSet<>();
		
		empDetails.add(a1);
		empDetails.add(a2);
		
		Iterator<Employee> iterate = empDetails.iterator();
		while (iterate.hasNext()) {
			 
			iterate.next().display();
			System.out.println();
			
		}
	}
}

class Employee {
		
	public Employee(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	int id;
	String name;
	int salary;
	
	public void display() {
		System.out.println("ID : " + id);
		System.out.println("Name : "+ name );
		System.out.println("Salary : " + salary);
	}
	
}