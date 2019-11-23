/*
1
21
321
4321
54321
*/
import java.util.Scanner;
class Pattern9
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the range.");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j>0;j--)
			{
				System.out.print(j+" ");
			}
			System.out.println("");
		}
	}
}

		
