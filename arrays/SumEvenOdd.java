import java.util.Scanner;
class SumEvenOdd
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("How many elements you have to store.");
		int n=sc.nextInt();
		int ar[]=new int[n];
		System.out.println("plz enter"+n+"elements.");
		for(int i=0;i<n;i++)
		{
			ar[i]=sc.nextInt();
		}
		System.out.println("Entered elements are:");
	    for(int j=0;j<n;j++)
		{
			System.out.println(ar[j]);
		}
		int eSum=0,oSum=0;
		for(int k=0;k<n;k++)
		{
			if(ar[k]%2==0)
				eSum=eSum+ar[k];
			else
				oSum=oSum+ar[k];
		}
		System.out.println("Sum of even number is :"+eSum);
		System.out.println("Sum of odd number is :"+oSum);
	}
}
