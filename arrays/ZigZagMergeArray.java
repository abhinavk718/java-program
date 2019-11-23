import java.util.Scanner;
class ZigZagMergeArray
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many elements you have to store in 1st array.");
		int n=sc.nextInt();
		int x[]=new int[n];
		System.out.println("plz enter "+n+" elements.");
		for(int i=0;i<x.length;i++)
		{
			x[i]=sc.nextInt();
		}
		System.out.println("Entered elements in 1st array :");
		for(int i=0;i<x.length;i++)
		{
			System.out.print(x[i]+" ");
		}
		System.out.println("\nEnter how many elements you have to store in 2nd array.");
		int p=sc.nextInt();
		int y[]=new int[p];
		System.out.println("plz enter "+p+" elements.");
		for(int i=0;i<y.length;i++)
		{
			y[i]=sc.nextInt();
		}
		System.out.println("Entered elements in 2nd array :");
		for(int i=0;i<y.length;i++)
		{
			System.out.print(y[i]+" ");
		}
		System.out.println("\nZigzag merge of given given Array are :");
		int z[]=zigZagMerge(x,y);
		for(int i=0;i<z.length;i++)
		{
			System.out.print(z[i]+" ");
		}
	}
	static int[] zigZagMerge(int[]a,int[]b)
	{
		int []c=new int[a.length+b.length];
		int i=0,j=0,k=0;
		while(i<a.length&&j<b.length)
		{
			c[k++]=a[i++];
			c[k++]=b[j++];
		}
		while(i<a.length)
		{
			c[k++]=a[i++];
		}
		while(j<b.length)
		{
			c[k++]=b[j++];
		}
		return c;
	}		
}

		