import java.util.Scanner;
class OddEven6
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :");
		int number=sc.nextInt();
		switch(number%2)
		{
			case 0:
			System.out.println(number+ " is even number.");
			break;
			case 1:
			System.out.println(number+ " is odd number.");
			break;
		}
	}
}
			
		