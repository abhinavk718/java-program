// program to cheak year is leap year or not??
import java.util.Scanner;
class CheakLeap
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the year : ");
		int year=sc.nextInt();
		if(year%400==0||year%4==0&&year%100!=0)
			System.out.println(year+ " is leap year");
		else
			System.out.println(year+ " is not leap year");
	}
}
