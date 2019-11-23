import java.util.Scanner;
class PrintStrongNumber
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the range.");
		int range=sc.nextInt();
		//for(int i=1;i<=range;i++)
			int i=1;
		while(i<=range)
		{
			if(isStrongNumber(i))
				System.out.print(i+" ");
			i++;
		}
	}
	static int factorial(int n)
	{
		int fact=1;
		while(n>0)
		{
			fact=fact*n;
			n--;
		}
		return fact;
	}
	static boolean isStrongNumber(int number)
	{
		int sum=0,t=number,ld;
		while(number>0)
		{
			ld=number%10;
			sum=sum+factorial(ld);
			number=number/10;
		}
		return sum==t;
		//if(sum==t)
			//return true;
		//else
			//return false;
	}
}
			