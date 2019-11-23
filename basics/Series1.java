//print series of 1 3 5 7 9 if n=5??
import java.util.Scanner;
class Series1
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the range.");
		int n=sc.nextInt();
		int i=1;
		while(n>0)
		{
			System.out.print(i+" ");
			i=i+2;
			n--;
		}
	}
}
 