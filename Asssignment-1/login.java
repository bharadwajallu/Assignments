import java.util.Scanner;
class login
{
	public static void main(String args[])
	{
		String userId="Allu";
		String password="112233";
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter userId");
		String entereduserId=sc.nextLine();
		System.out.println("Enter password");
		String enteredpassword=sc.nextLine();

		if(userId.equals(entereduserId))
		{
			for(int i=0;i<3;i++)
			{
				if(password.equals(enteredpassword))
				{
					System.out.println("Login Successfull");
					break;
				}
				else if(i==2)
				{
				System.out.println("contact Admin");
				break;
				}
			}
			System.out.println("wrong passwor Enter again:");
			enteredpassword=sc.nextLine();

		}
		else
		{
			System.out.println("Wrong Username");
		}
	}
}