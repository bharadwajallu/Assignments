public class armstrong2
{
	public static void main(String args[])
	{
		int i=100,arm,a,n;
		System.out.println("Armstrong numbers between 100-999:");
		while(i<1000)
		{
			n=i;
			arm=0;
			while(n>0)
			{
				a=n%10;
				arm=arm+(a*a*a);
				n=n/10;
			}
			if(arm==i)
			System.out.println(i);
			i++;
		}
	}
}			
