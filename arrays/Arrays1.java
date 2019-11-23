import java.util.Scanner;
class Arrays1
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many element you want to store.");
		int n=sc.nextInt();
		int []x=new int[n];
		System.out.println("Plz enter "+n+" elements.");
		for(int i=0;i<x.length;i++)
		{
		x[i]=sc.nextInt();
		}
	}
}

		
		