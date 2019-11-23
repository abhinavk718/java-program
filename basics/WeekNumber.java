import java.util.Scanner;
class WeekNumber
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter day number :");
		int number=sc.nextInt();
		if(number==1)
			System.out.println("Today is sunday.");
		else if(number==2)
			System.out.println("Today is monday.");
		else if(number==3)
			System.out.println("Today is tuesday.");
		else if(number==4)
			System.out.println("Today is wednesday.");
		else if(number==5)
			System.out.println("Today is thursday.");
		else if(number==6)
			System.out.println("Today is friday.");
		else if(number==7)
			System.out.println("Today is saturday.");
		else 
			System.out.println("Invalid day number.");
	}
}
