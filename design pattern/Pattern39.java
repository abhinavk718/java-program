/*
1  2  3  4  5
11 12 13 14 15
21 22 23 24 25
16 17 18 19 20
 6  7  8  9 10
 */
import java.util.Scanner;
class Pattern39
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the range.");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
} 