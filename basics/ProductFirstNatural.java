import java.util.Scanner;
class ProductFirstNatural
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number ");
		int n=sc.nextInt();
		int product=1,t=n;
		while(n>1)
		{
			product =product*n;
			n--;
		}
		System.out.println("The product of first " + t + " natural number is : " +product);
	}
}
