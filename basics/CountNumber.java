//write a program to count how many numbers are divisible by 3 ??
import java.util.Scanner;
class CountNumber
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number : ");
		int number=sc.nextInt();
		int count=number/3;
		System.out.println(count+ " numbers are divisible by 3.");
	}
}
