/*
54321
 4321
  321
   21
    1
	*/
	import java.util.Scanner;
	class Pattern11
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
				for(int j=n-i;j>0;j--)
				{
					System.out.print(j+" ");
				}
				System.out.println("");
			}
		}
	}
	
	