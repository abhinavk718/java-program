import java.util.Scanner;
class ReadIntArray
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("plz Enter how many Integer value you have.");
		int n=sc.nextInt();
		System.out.println("plz Enter "+n+" elements.");
		int ar[]=new int[n];
		for(int i=0;i<n;i++)
		{
		   ar[i] =sc.nextInt();
		}
	   System.out.print("Entered elements are :");
	   for(int j=0;j<n;j++)
	   {
		  System.out.print(ar[j]+" "); 
	   }
	   int pcount=0,ncount=0;
	   for(int k=0;k<n;k++)
	   {
		   if(ar[k]<0)
			   ncount++;
		   else
			   pcount++;
	   }
	   System.out.println("\nNegative value in the given array is :"+ncount);
	   System.out.println("\npositive value in the given array is :"+pcount);   
	}
}