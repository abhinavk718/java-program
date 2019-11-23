//program to delete an element from a particular index??
import java.util.Scanner;
class DeleteElementArray
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Plz enter how many elements want to store in an Array.");
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
		System.out.println("\nplz enter index at which you want to delete an element.");
		int index=sc.nextInt();
		System.out.println("Array after deletion of an element.");
		int[]y=insertEleIndex(x,index);
		for(int i=0;i<y.length;i++)
		{
			System.out.print(y[i]+" ");
		}
	}
	static int[] insertEleIndex(int[]a,int index)
	{
		if(index<0||index>a.length)
		{
			System.out.println("Given index not in range.");
			return a;
		}
		int []b=new int[a.length-1];
		for(int i=0;i<b.length;i++)
		{
			if(i<index)
				b[i]=a[i];
			else
				b[i]=a[i+1];
		}
		return b;
	}		
}