class AdditionThree
{
	public static void main(String [] args)
	{
		int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
		int arr1[][]= {{1,2,3},{4,5,6},{7,8,9}};
		int sum[][]= new int[3][3];
		
		for (int i =0; i<arr.length; i++)
		{
			for (int j =0; j<arr1.length;j++)
			{
				sum[i][j] = arr[i][j]+arr1[i][j];
			}
		}
		
		for (int i =0; i<arr.length; i++)
		{
			for (int j =0; j<arr1.length;j++)
			{
				System.out.print(sum[i][j]+" ");
			}
			System.out.print("\n");
		}
	}
}
