//define a method to check the number is strong number or not??
import java.util.Scanner;
class CheckStrongNumber
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number.");
		int number=sc.nextInt();
		boolean result=isStrongNumber(number);
		if(result)
			System.out.println(number+" is strong number.");
		else
			System.out.println(number+" is not strong number.");
	}
	 static boolean isStrongNumber(int number)
	{
		int sum=0,t=number;
		while(number!=0)
		{
			int ld=number%10;
			sum=sum+fact(ld);
			number=number/10;
		}
		return sum==t;
		//if(sum==t)
		//return true;
	   // else
		//return false;
		
	}
	static int fact(int number)
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
	