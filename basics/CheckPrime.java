//define a method to check the number is prime or not??
import java.util.Scanner;
class CheckPrime
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number.");
		int n=sc.nextInt();
		boolean rs=isPrime(n);
		if(rs==true)
			System.out.println(n+" is prime number");
		else
			System.out.println(n+" is  not prime number");
	}
	static boolean isPrime(int x)
	{
		int i=2;
		while(i<=x/2)
		{
			if(x%i==0)
				return false;
			i++;
		}
		return true;
	}
}

		