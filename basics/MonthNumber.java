import java.util.Scanner;
class MonthNumber
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the month number :");
		int Number=sc.nextInt();
		if(Number==1||Number==3||Number==5||Number==7||Number==8||Number==10||Number==12)
			System.out.println("it has 31 days.");
		else if(Number==2)
			System.out.println("it has 28/29 days.");
		else if(Number==4||Number==6||Number==5||Number==9||Number==11)
			System.out.println("it has 30 days.");
		else 
			System.out.println("INVALID month number.");
	}
}

			
			
		