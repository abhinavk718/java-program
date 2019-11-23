 /*
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
1 2 3 4
1 2 3
1 2
1
*/
import java.util.Scanner;
class Pattern40
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the range.");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		for(int j=1;j<=n-1;j++)
		{
			for(int k=1;k<=n-j;k++)
			{
				System.out.print(k+" ");
			}
			System.out.println();
		}
		System.out.println();
	}
}