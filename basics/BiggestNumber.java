import java.util.Scanner;
class BiggestNumber
{
	public static void main(String[]args)
	{
		Scanner dc=new Scanner(System.in);
		System.out.print("Enter first number :");
		int a=dc.nextInt();
		System.out.print("Enter second number :");
		int b=dc.nextInt();
		System.out.print("Enter third number :");
		int c=dc.nextInt();
		if(a>b&&a>c)
			System.out.println(a+ " is big.");
		else if(b>c)
			System.out.println(b+ " is big.");
		else
			System.out.println(c+ " is big.");
	}
}

			