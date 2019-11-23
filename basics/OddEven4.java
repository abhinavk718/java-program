import java.util.Scanner;
class OddEven4
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number : ");
		long number=sc.nextLong();
		if((number/2)*2==number)
			System.out.println(number+" is even number.");
		else
			System.out.println(number+" is odd number.");
	}
}