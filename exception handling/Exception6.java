import java.util.Scanner;
class Exception6
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Main Method Started.");
		int x[]={45,45,78,65,54,32,0,34};
		System.out.println("Enter the first index.");
		int p=sc.nextInt();
		System.out.println("Enter the Second index.");
		int q=sc.nextInt();
		try
		{
			int result=x[p]/x[q];
			System.out.println("quotient is :"+result);
		}
		catch(Exception e)
		{   
			System.out.println("Exception occured.");
			System.out.println(e);
		}
		System.out.println("Thank you.");
		System.out.println("Main method ended.");
	}
}
		
		
