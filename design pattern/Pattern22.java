/*
123456789
 1234567
  89123
   456
    7
	*/
	import java.util.Scanner;
	class Pattern22
	{
		public static void main(String[]args)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the range.");
			int n=sc.nextInt();
			int k=1;
			for(int i=1;i<=n;i++)
			{
				for(int j=1;j<i;j++)
				{
					System.out.print(" ");
				}
				for(int j=0;j<=(n-i)*2;j++)
				{
					System.out.print(k);
					if(k==9)
					{
						k=0;
					}
					k++;
				}
				System.out.println("");
			}
		}
	}
	
				
			