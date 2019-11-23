import java.util.Scanner;
class PrimeStrongprint
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Range.");
		int range=sc.nextInt();
		for(int i=1;i<=range;i++)
		{ 
	        int sn=isStrongNumber(i);
			boolean  spn=isPrimeStrong(sn);
			if(spn)
			System.out.print(i+" ");
		}	
	}
	static int isStrongNumber(int number)
	{
		int sum=0,t=number;
		while(number>0)	
		{
			int r=number%10;
			sum=sum+factorial(r);
			number=number/10;
		}
		 if(sum==t)
         return t;			 
	}
	static int factorial(int n)
	{
		int fact=1;
		while(n>1)
		{
			fact=fact*n;
			n--;
		}
		return fact;
	}
	static boolean isPrimeStrong(int num)
	{
		int i=2;
		while(i<num/2)
		{
			if(num%i==0)
				return false;
			i++;
		}
		return true;
	}
}