//program to count leap year through user entred year??
import java.util.Scanner;
class CountLeapYear
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the year : ");
		int year=sc.nextInt();
		int noOfYear=(year/4)+(year/400)-(year/100);
		System.out.println(noOfYear+ " Leap years before " +year+".");
	}
}

		
