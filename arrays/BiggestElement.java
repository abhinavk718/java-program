import java.util.Scanner;
class BiggestElement
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("plz enter how many elements you have to store 1st array.");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("plz enter "+n+" Elements.");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Entered elements are :");
		for(int k=0;k<n;k++)
		{
			System.out.println(a[k]);
		}
		System.out.println("plz enter how many elements you have to store 2nd array.");
		int p=sc.nextInt();
		int b[]=new int[p];
		System.out.println("plz enter "+p+" Elements.");
		for(int j=0;j<p;j++)
		{
			b[j]=sc.nextInt();
		}
		System.out.println("Entered elements are :");
		for(int l=0;l<p;l++)
		{
			System.out.println(b[l]);
		}
		System.out.println("Merging of two arrays are :");
		int m[]=getMergeArray(a,b);
		for(int d=0;d<m.length;d++)
		{
			System.out.println(m[d]);
		}
	     int biggest=getBiggest(m);
		 System.out.println("Biggest element in merged array is :"+biggest);
	}
	static int[] getMergeArray(int[]x,int[]y)
	{
		int []z=new int[x.length+y.length];
		for(int m=0;m<x.length;m++)
		{
			z[m]=x[m];
		}
		for(int q=0;q<y.length;q++)
		{
			z[x.length+q]=y[q];
		}
		return z;
	}
	static int getBiggest(int[]c)
	{
		int big=c[0];
		for(int e=1;e<c.length;e++)
		{
			if(big<c[e])
				big=c[e];
		}
		return big;
	}
}

		