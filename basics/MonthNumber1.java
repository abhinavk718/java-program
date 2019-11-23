import java.util.Scanner;
class MonthNumber1
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number.");
		int number=sc.nextInt();
		switch(number)
		{
		    case 1:
			System.out.println("january has 31 days.");
			break;
			case 2:
			System.out.println("february has 28/29 days.");
			break;
			case 3:
			System.out.println(" march has 31 days.");
			break;
			case 4:
			System.out.println("april has 30 days .");
			break;
			case 5:
			System.out.println("may has 31 days.");
			break;
			case 6:
			System.out.println("june has 30 days.");
			break;
			case 7:
			System.out.println(" july has 31 days.");
			break;
			case 8:
			System.out.println("august has 31 days.");
			break;
			case 9:
			System.out.println("september 30 days.");
			break;
			case 10:
			System.out.println("october has 31 days.");
			break;
			case 11:
			System.out.println("november has 30 days.");
			break;
			case 12:
			System.out.println("december has 31 days.");
			break;
			default :
			System.out.println("Invalid month number.");
		}
	}
}
