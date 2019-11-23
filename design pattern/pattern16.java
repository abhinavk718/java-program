/*
1
01
010
1010
10101
010101
*/
import java.util.Scanner;
class pattern16
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number.");
		int n=sc.nextInt();
		int k=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(k%2+" ");
				k++;
			}
			System.out.println("");
		}
	}
}