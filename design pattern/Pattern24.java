/*
10101
 1010
  101
   10
    1
	*/
	import java.util.Scanner;
	class Pattern24
	{
		public static void main(String[]args)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the range.");
			int n=sc.nextInt();
			for(int i=0;i<n;i++)
			{
				for(int j=0;j<i;j++)
				{
					System.out.print("  ");
				}
				for(int j=1;j<=n-i;j++)
				{
					System.out.print(j%2+" ");
				}
				System.out.println("");
			}
		}
	}