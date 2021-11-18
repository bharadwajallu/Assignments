package Junit_Assignment_04;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public class All 
{
	
	@BeforeEach
	void init() {
		System.out.println("string is intialized");	
	}
	@AfterEach
	void cleanup() {
		System.out.println("Cleaning up");
	}

}
