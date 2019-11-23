import java.util.Scanner;
class EvenOdd
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number :");
		long number=sc.nextInt();
		if(number%2==0)
			System.out.println(number +" is even number");
		else
			System.out.println(number +" is odd number");
	}
}
