// define a method to return sum of plaindrome number in a given array??
import java.util.Scanner;
class Sum_Plaindrome_Array
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Plz enter how many elements you have to store.");
		int n=sc.nextInt();
		int []x=new int[n];
		System.out.println("Plz enter "+n+" elements.");
		for(int i=0;i<x.length;i++)
		{
			x[i]=sc.nextInt();
		}
		int result=sum_Plaindrome(x);
		System.out.println("Sum of plaindrome number in a given array is :"+result);
	}
	static int sum_Plaindrome(int[]a)
	{
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			if(is_Plaindrome(a[i]))
				sum=sum+a[i];
		}
		return sum;
	}
	static boolean is_Plaindrome(int a)
	{
		int r,rev=0,t=a;
		while (a>0)
		{
			r=a%10;
			rev=rev*10+r;
			a=a/10;
		}
		return rev==t;
	}
}

		