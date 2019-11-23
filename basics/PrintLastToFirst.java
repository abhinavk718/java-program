import java.util.Scanner;
class PrintLastToFirst
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number.");
		int number=sc.nextInt();
		int i=number;
		while(i>=1&&i<=number)
		{
		System.out.print(i+ " ");
		i--;
		}
		
	}
}
		
		
		