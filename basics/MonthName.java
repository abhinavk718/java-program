import java.util.Scanner;
class MonthName
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number.");
		int number=sc.nextInt();
		switch(number)
		{
		    case 1:
			System.out.println("This month is january.");
			break;
			case 2:
			System.out.println("This month is february.");
			break;
			case 3:
			System.out.println("This month is march.");
			break;
			case 4:
			System.out.println("This month is april.");
			break;
			case 5:
			System.out.println("This month is may.");
			break;
			case 6:
			System.out.println("This month is june.");
			break;
			case 7:
			System.out.println("This month is july.");
			break;
			case 8:
			System.out.println("This month is august.");
			break;
			case 9:
			System.out.println("This month is september.");
			break;
			case 10:
			System.out.println("This month is october.");
			break;
			case 11:
			System.out.println("This month is november.");
			break;
			case 12:
			System.out.println("This month is december.");
			break;
			default :
			System.out.println("Invalid momth number.");
		}
	}
}
