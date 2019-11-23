// program to count prime number in a given array??
import java.util.Scanner;
class CountPrimeNumberArray
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("plz enter how many elements you have to store.");
		int n=sc.nextInt();
		int []x=new int[n];
		System.out.println("Plz enter "+n+" elements.");
		for(int i=0;i<x.length;i++)
		{
			x[i]=sc.nextInt();
		}
		int cp=countPrimeNumber(x);
		System.out.println("Prime number in a given array are :"+cp);
	}
	static int countPrimeNumber(int []a)
	{
		int count=0;
		for(int i=0;i<a.length;i++)
		{
		    if(isPrimeNumber(a[i]))
				count++;
		}
		return count;
	}
	static boolean isPrimeNumber(int a)
	{
		for(int i=2;i<=a/2;i++)
		{
			if(a%i==0)
			return false;
		}
		return true;
	}
}