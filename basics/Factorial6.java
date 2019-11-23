import java.util.Scanner;
class Factorial6
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the range.");
		int n=sc.nextInt();
		int i=1;
		while(i<=n)
		{
			System.out.println(i+"!= "+factorial(i));
			i++;
		}
	}
	static int factorial(int number)
	{
		int fact=1;
		while(number>0)
		{
			fact=fact*number;
			number--;
		}
		return fact;
	}
}