import java.util.Scanner;
class ProductDigit
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number.");
		int number=sc.nextInt();
		int product=1,t=number;
		while(number!=0)
		{
		   int digit	=number%10;
		   product=product*digit;
		   number=number/10;
		}
		System.out.println("The product of digit of " + t+ " is :"+product);
	}
}

			