import java.util.Scanner;
class Exception7
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Main Method Started.");
		String str=null;
		System.out.println("Enter the number.");
		int n=sc.nextInt();
		if(n==1)
			str="abhinav";
		try
		{
			System.out.println("Number of character :"+str.length());
			//System.exit(0);
		}
		catch(NullPointerException e)
		{
			System.out.println("NullPointerException found.");
		}
		finally
		{
			System.out.println("I am finally block. ");
		}
		System.out.println("Thank you");
		System.out.println("Main Method ended.");
	}
}

			