/*
       1
	  212
	 32123
	4321234
   543212345
	         */
import java.util.Scanner;
class Pattern30 
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the range.");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n-i;j++)
			{
				System.out.print("  ");
			}
			int k=i;
			for(int j=1;j<=2*i-1;j++)
			{
				System.out.print(k+" ");
				if(j<i)
					k--;
				else
					k++;
			}
			System.out.println();
		}
	}
}
