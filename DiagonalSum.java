class DiagonalSum
{
	public static void main(String [] args)
	{
		int arr[][] = {{5,2,3},{4,5,6},{13,8,16}};
		int sum1=0;
		int sum2=0;
		
		for (int i =0; i<arr.length; i++)
		{
			for (int j =0; j<arr[i].length;j++)
			{
				if (i==j)
				{
					sum1 = sum1+arr[i][j];
				}
				if (i+j==2)
				{
					sum2 = sum2+arr[i][j];
				}
				
			}
		}
		System.out.print("Sum of left diagonal: "+sum1);
		System.out.print("\n");
		System.out.print("Sum of right diagonal: "+sum2);
		/*for (int i =0; i<arr.length; i++)
		{
			for (int j =0; j<arr1.length;j++)
			{
				System.out.print(product[i][j]+" ");
			}
			System.out.print("\n");
		}*/
	}
}
