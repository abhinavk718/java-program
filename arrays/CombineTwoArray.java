import java.util.Scanner;
class CombineTwoArray
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many element you have to store in 1st array.");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("plz enter "+n+" Elements.");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter how many element you have to store in 2n array.");
		int p=sc.nextInt();
		int b[]=new int[p];
		System.out.println("plz enter "+p+" Elements.");
		for(int j=0;j<p;j++)
		{
			b[j]=sc.nextInt();
		}
		int com[]=combineArray(a,b);
		System.out.println("Combination of two arrays are :");
		for(int m=0;m<com.length;m++)
		{
			 System.out.print(com[m]+" ");
		}
	}
	 static int[] combineArray(int[]x,int[]y)
	 {
		 int[]z=new int[x.length+y.length];
		 for(int k=0;k<x.length;k++)
		 {
			z[k]=x[k];
		 }
		 for(int l=0;l<y.length;l++)
		 {
			 z[x.length+l]=y[l];
		 }
		 return z; 
	 } 
}