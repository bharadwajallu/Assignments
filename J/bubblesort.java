class bubblesort
{
	static void bubblesort(int array[])
	{
		int n=array.length;
		int temp=0;
		for(int i=0;i<n;i++)
		{
			for(int j=1;j<n-i;j++)
			{
				if(array[j-1] > array[j])
				{
					temp=array[j-1];
					array[j-1]=array[j];
					array[j]=temp;
				}
			}
		}
	}
	public static void main(String args[])
	{
		int arr[]={5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
		System.out.println("Array before bubblesort:");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]+" ");
		}
		System.out.println();
		bubblesort(arr);
		System.out.println("Array After Bubble Sort:");	
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}	

	}
}
