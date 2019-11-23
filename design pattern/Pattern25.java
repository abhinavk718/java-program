    /*
            1
	   234
	  56789
	 1234567
	891234567
	*/
	import java.util.Scanner;
	class Pattern25
	{
		public static void main(String[]args)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the range.");
			int n=sc.nextInt();
			int k=1;
			for(int i=1;i<=n;i++)
			{
				for(int j=1;j<=n-i;j++)
				{
					System.out.print(" ");
				}
				for(int j=1;j<=2*i-1;j++)
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
	