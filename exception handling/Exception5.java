import java.util.Scanner;
class Exception5
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Main Method Started.");
		System.out.println("Enter the first number.");
		String p=sc.next();
		System.out.println("Enter the Second number.");
		String q=sc.next();
		try
		{
			int a=Integer.parseInt(p);
			int b=Integer.parseInt(q);
			System.out.println("Quotient is :"+(a/b));
		}
		catch(ArithmeticException e)
		{
			System.out.println("Found ArithmeticException.");
		}
		catch(NullPointerException e)
		{
			System.out.println("Found NullPointerException.");
		}
		catch(RuntimeException e)
		{
			System.out.println("Found RuntimeException.");
		}
	}
}

		
			
		