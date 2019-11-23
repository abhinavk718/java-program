import java.util.Scanner;
class OddProduct
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the range.");
		int n=sc.nextInt();
		int i=1,p=1;
		while(i<=n)
		{
			p=p*i;
			i=i+2;
		}
		System.out.println("The product of odd number up to "+n+" is : "+p);
	}
}
		