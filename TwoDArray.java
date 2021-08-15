import java.util.Scanner;
class TwoDArray
{
	public static void main(String [] args)
	{
		int arr[][] = new int[5][4];
		Scanner sc = new Scanner(System.in);
		System.out.println (arr.length);
		System.out.println (">>> Enter Numbers");
		
		for (int i =0; i<arr.length; i++)
		{
			for (int j = 0;j<arr[i].length;j++)
			{
				arr[i][j] = sc.nextInt();
			}
			
		}
		
		for (int i =0; i<arr.length; i++)
		{
			for (int j = 0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.print("\n");
		}
		
	}
}
