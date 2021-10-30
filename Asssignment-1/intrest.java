import java.util.Scanner;
class intrest
{
	public static void main(String args[])
	{
		double pr,rate,time,sim,com;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the amount:");
		pr=sc.nextDouble();
		System.out.println("Enter the number of years:");
		time=sc.nextDouble();
		System.out.println("Enter the Rate of intrest:");
		rate=sc.nextDouble();
		sim=(pr*time*rate)/100;
		com=pr*Math.pow(1.0+rate/100.0,time)-pr;
		System.out.println("Simple Intrest:"+sim);
		System.out.println("Compound Intrest:"+com);
	}
}