//program to define a method to return union of two arrays??
import java.util.Scanner;
class Union_Of_Arrays
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
		System.out.println("Union of two arrays are :");
		int []z=union_Of_Arrays(x,y);
		for(int i=0;i<z.length;i++)
		{
			System.out.print(z[i]+" ");
		}
	}
	static int[] union_Of_Arrays(int []a,int[]b)
	{
		int []c=new int[a.length+b.length];
		int k=0;
		for(int i=0;i<a.length;i++)
		{
			c[k++]=a[i];
		}
		for(int i=0;i<b.length;i++)//58 34 67 12 39 48
		{
			int find=0;
			for(int j=0;j<a.length;j++)//34 56 67 23 12
			{
			    if(a[j]==b[i])
				{
					find=1;
				    break;
				}
			}
			if(find==0)
		    c[k++]=b[i];
		} 
		int []narr=new int[k];
		for(int j=0;j<narr.length;j++)
		{
			narr[j]=c[j];
		}
		return narr;
	}
}
