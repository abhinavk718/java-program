/*
1
1 2
1 2 3
1 2 3
1 2
1
*/
import java.util.Scanner;
class Pattern41
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
		for(int k=0;k<n;k++)
		{
			for(int l=1;l<=n-k;l++)
			{
			    System.out.print(l+" ");	
			}
			System.out.println();
		}
	}
}