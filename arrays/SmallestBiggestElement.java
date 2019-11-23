import java.util.Scanner;
class SmallestBiggestElement
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Plz enter how many elements you have to store.");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("please enter "+n+" elements.");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Entered elements are :");
		for(int j=0;j<n;j++)
		{
			System.out.println(a[j]);
		}
		int s=getSmallestElement(a);
		System.out.println("Smallest element in an array is :"+s);
		int b=getBiggestElement(a);
		System.out.println("Biggest element in an array is :"+b);
	}
	static int getSmallestElement(int ar[])
	{
		int sm=ar[0];
		for(int k=1;k<ar.length;k++)
		{
		    if(sm>ar[k])
				sm=ar[k];
		}
		return sm;
	}
	static int getBiggestElement(int ar[])
	{
		int big=ar[0];
		for(int k=1;k<ar.length;k++)
		{
		    if(big<ar[k])
				big=ar[k];	
		}
		return big;
	}
				
}