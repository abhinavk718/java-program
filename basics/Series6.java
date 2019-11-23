import java.util.Scanner;
class Series6
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the range.");
		int n=sc.nextInt();
		int i=1;
		while(i<=n)
		{
			int p=i*i;
			System.out.print(p+" ");
			i++;
		}
	}
}