import java.util.Scanner;
class CountEvenOdd
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("How many elements you have to store.");
		int n=sc.nextInt();
		int ar[]=new int[n];
		System.out.println("plz enter "+n+" elements :");
		for(int i=0;i<n;i++)
		{
			ar[i]=sc.nextInt();
		}
		System.out.print("Entered elements are :");
		for(int k=0;k<n;k++)
		{
			System.out.print(ar[k]+" ");
		}
		int eCount=0,oCount=0;
		for(int k=0;k<n;k++)
		{
			if(ar[k]%2==0)
				eCount++;
			else
				oCount++;
		}
		System.out.println("\nEven number in the given array are :"+eCount);
		System.out.println("\nOdd number in the given array are :"+oCount);
	}
}
		
		
		
		