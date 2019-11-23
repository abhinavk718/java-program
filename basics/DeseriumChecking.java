import java.util.Scanner;
class DeseriumChecking
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enyter the number.");
		int number=sc.nextInt();
		boolean res=isDeserium(number);
		if(res)
			System.out.println(number+" is deserium number.");
		else
			System.out.println(number+" is not deserium number.");	
	}
	static int digitCounts(int n)
	{
		int count=0;
		while(n>0)
		{
			int r=n%10;
			count++;
			n=n/10;
		}
		return count;
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
	static boolean isDeserium(int num)
	{
		int sum=0,t=num;
		int count=digitCounts(num);
		while(num>0)
		{
			int r=num%10;
			sum=sum+power(r,count);
			count--;
			num=num/10;
		}
		return sum==t;
	}
}
	
			
		