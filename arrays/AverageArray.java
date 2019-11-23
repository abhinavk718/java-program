import java.util.Scanner;
class AverageArray
{
	public static void main(String[]args)
	{
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many elements you have to store.");
		int n=sc.nextInt();
		int x[]=new int[n];
		System.out.println("Plz Enter "+n+" elements.");
		for(int i=0;i<n;i++)
		{
			x[i]=sc.nextInt();
		}
           double avg=averageArray(x);
		   System.out.println("Average of array elements are :"+avg);
		
	}
	static double averageArray(int[]y)
	{
		double sum=0;
		for(int j=0;j<y.length;j++)
		{
		sum=sum+y[j];
		}
		return sum/y.length;
	}
}