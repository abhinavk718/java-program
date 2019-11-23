import java.util.Scanner;
public class Check_PrimeNumber
{
	public static void main(String []args)
	{ 
	    Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number.");
		int x=sc.nextInt();
		boolean res=isprime(x);
		if(res==true)
			System.out.println("prime number");
		else
			System.out.println("not prime number");		
	}
	public static boolean isprime(int x)
	{
		for(int i=2;i<=x/2;i++)
		{
		 if(x%i==0)
			return false;
		}
		return true;
	}
}
