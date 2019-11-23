import java.util.Scanner;
class ArmstrongChecking
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number.");
		int number=sc.nextInt();
		boolean rs=isArmstrong(number);
		if(rs)
			System.out.println(number+" is armstrong number.");
		else
			System.out.println(number+" is not armstrong number.");
	}
	static int digitCounts(int n)
	{
		int dcount=0;
		while(n>0)
		{
			dcount++;
			n=n/10;
		}
		return dcount;
	}
	static int power(int p,int q)
	{
		int pow=1;
		while(q>0)
		{
			pow=pow*p;
			q--;
		}
		return pow;
	}
	static boolean isArmstrong(int num)
	{
		int sum=0,t=num;
		int digit=digitCounts(num);
		while(num!=0)
		{
			int r=num%10;
			sum=sum+power(r,digit);
			num=num/10;
		}
		return sum==t;
	}
}
		
		
			
			
			