import java.util.Scanner;
class BackPrinting
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number.");
		int n=sc.nextInt();
		while(n>0)
		{
			System.out.print(n+" ");
			n--;
		}
	}
}