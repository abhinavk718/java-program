import java.util.Scanner;
class MergeSortedArray
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Plz enter how many elements want to store in 1st Array.");
		int n=sc.nextInt();
		int[]x=new int[n];
		System.out.println("plz enter "+n+" elements.");
		for(int i=0;i<x.length;i++)
		{
			x[i]=sc.nextInt();
		}
		System.out.println("Entered element in 1st Array are :");
		for(int i=0;i<x.length;i++)
		{
			System.out.print(x[i]+" ");
		}
		System.out.println("\nPlz enter how many elements want to store in 2nd Array.");
		int p=sc.nextInt();
		int[]y=new int[p];
		System.out.println("plz enter "+p+" elements.");
		for(int i=0;i<y.length;i++)
		{
			y[i]=sc.nextInt();
		}
		System.out.println("Entered element in 2nd Array are :");
		for(int i=0;i<y.length;i++)
		{
			System.out.print(y[i]+" ");
		}
		System.out.println("\nShorted merge of given array are :");
		int []z=sortedMerge(x,y);
		for(int i=0;i<z.length;i++)
		{
			System.out.print(z[i]+" ");
		}
	}
	static int[] sortedMerge(int[]a,int[]b)
	{
		int[]c=new int[a.length+b.length];
		int i=0,j=0,k=0;
		while(i<a.length&&j<b.length)
		{
			if(a[i]<b[j])
				c[k++]=a[i++];
			else 
				c[k++]=b[j++];
		}
		while(i<a.length)
			c[k++]=a[i++];
		while(j<b.length)
			c[k++]=b[j++];
		return c;
	}		
}