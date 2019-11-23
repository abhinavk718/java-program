import java.util.Scanner;
class Exception2
{
	public static void main(String[]args)
	{
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the first value.");
	    int a=sc.nextInt();
	    System.out.println("Enter the Second value.");
	    int b=sc.nextInt();
	    System.out.println("First value is :"+a);
	    System.out.println("Second value is :"+b);
	    try
	    {
	        double d=a/b;
	        System.out.println("Quotient is :"+d);
	    }
	    catch(ArithmeticException e)
        {
		    System.out.println("Second value should not be zero.");
	    }
	    System.out.println("Thank You.");
	    System.out.println("Main method ended.");
	}
}
	
