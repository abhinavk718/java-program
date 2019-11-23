import java.util.Scanner;
class Exception
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Main method started.");
		System.out.println("Enter the first number.");
		int x=sc.nextInt();
		System.out.println("Enter the second number.");
		int y=sc.nextInt();
		try
		{
		int res=x/y;
		System.out.println("Quotient is :"+res);
		}
		catch(ArithmeticException e)
		{
			System.out.println("found ArithmeticException.");
			System.out.println("Second number must not be zero.");
			System.out.println(e);
			System.out.println(e.getMessage());
		}
		System.out.println("Main method end.");
	}
}