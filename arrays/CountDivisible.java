import java.util.Scanner;
class CountDivisible
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many elements you have to store.");
		int n=sc.nextInt();
		System.out.println("plz enter "+n+"elements.");
		int ar[]=new int[n];
		for(int i=0;i<n;i++)
		{
			ar[i]=sc.nextInt();
		}
		System.out.println("Entered Elements are :");
		for(int k=0;k<n;k++)
		{
			System.out.println(ar[k]);
		}
		int dCount=0;
		for(int j=0;j<n;j++)
		{
			if(ar[j]%3==0&&ar[j]%5==0)
				dCount++;
		}
		System.out.println("Divisible of 3 and 5 are :"+dCount);
		
	}
}
			
		
	