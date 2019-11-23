//Program to insert an array into another array??
import java.util.Scanner;
class InsertArray
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
		System.out.println("Entered element in an Array are :");
		for(int i=0;i<x.length;i++)
		{
			System.out.print(x[i]+" ");
		}
		System.out.println("\nplz enter how many elements you want to store in 2nd element.");
		int p=sc.nextInt();
		int[]y=new int[p];
		System.out.println("plz enter "+p+" elements.");
		for(int i=0;i<y.length;i++)
		{
			y[i]=sc.nextInt();
		}
		System.out.println("Entered element in an Array are :");
		for(int i=0;i<y.length;i++)
		{
			System.out.print(y[i]+" ");
		}
		System.out.println("\nplz enter index.");
		int index=sc.nextInt();
		int []z=insertArray(x,y,index);
		for(int i=0;i<z.length;i++)
		{
			System.out.print(z[i]+" ");
		}
	}
	static int[] insertArray(int[]x,int[]y,int index)
	{
		if(index<0||index>x.length)
		{
			System.out.println("Array index out of bound.");
			return x;
		}
		int []z=new int[x.length+y.length];
		for(int i=0;i<x.length;i++)
		{
			if(i<index)
				z[i]=x[i];
			else
				z[i+y.length]=x[i];
		}
		for(int i=0;i<y.length;i++)
		{
		    z[index+i]=y[i];
		}
		return z;
	}	
}