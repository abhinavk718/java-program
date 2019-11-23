import java.util.Scanner;
class PrintEvenNumber
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number ");
		int n=sc.nextInt();
		int even=0,i=1;
		while(i<=n/2)
		{
		    even=even+2;
			i++;
		    System.out.print(even +" ");
		}
	}
}