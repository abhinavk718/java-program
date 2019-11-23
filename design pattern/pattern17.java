/*
1
10
101
1010
10101
*/
import java.util.Scanner;
class Pattern17
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Eter the range.");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j%2+" ");
			}
			System.out.println("");
		}
	}
}
			