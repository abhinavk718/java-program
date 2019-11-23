//program to define a method to return intresection of two arrays??
import java.util.Scanner;
class Intersection_Of_Arrays
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Plz enter how many elements you have to store in 1st Array.");
		int p=sc.nextInt();
		int []x=new int[p];
		System.out.println("plz enter "+p+" elements.");
		for(int i=0;i<x.length;i++)
		{
			x[i]=sc.nextInt();
		}
		System.out.println("Plz enter how many elements you have to store in 2nd Array.");
		int q=sc.nextInt();
		int []y=new int[q];
		System.out.println("plz enter "+q+" elements.");
		for(int i=0;i<y.length;i++)
		{
			y[i]=sc.nextInt();
		}
		System.out.println("Intersection of two arrays are :");
		int []z=intersection_Of_Arrays(x,y);
		for(int i=0;i<z.length;i++)
		{
			System.out.print(z[i]+" ");
		}
	}
	static int[] intersection_Of_Arrays(int []a,int[]b)
	{
		int []c=new int[a.length];
		int k=0;
		for(int i=0;i<a.length;i++)//34 56 67 23 12
		{
			for(int j=0;j<b.length;j++)//58 34 67 12 39 48
			{
				if(a[i]==b[j])
				{
					c[k++]=a[i];
					break;
				}
			}
		}
		int []narr=new int[k];
		for(int j=0;j<narr.length;j++)
		{
			narr[j]=c[j];
		}
		return narr;
	}
}
