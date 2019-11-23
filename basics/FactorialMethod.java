//define a method to calculate factorail of the number??
import java.util.Scanner;
class FactorialMethod
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter  the number.");
		int number=sc.nextInt();
		int t=number;
		int result=getFactorial(number);
		System.out.println("The factorial of "+t+" is "+result);
	}
	static int getFactorial(int number)
	{
		int fact=1;
		while(number>1)
		{
			fact=fact*number;
		    number--;
		}
        return fact;		
	}
}
	
	