import java.util.Scanner;
class ArraySum
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("plz Enter how many elements you want to store.");
		int n=sc.nextInt();
		System.out.println("plz Enter "+n+" element.");
		int x[]=new int[n];
		for(int i=0;i<x.length;i++)
		{
			x[i]=sc.nextInt();
		}
		int sum=0;
		for(int j=0;j<x.length;j++)
		{
			sum=sum+x[j];
		}
		System.out.println("sum of entered element is : "+sum);
	}
}
