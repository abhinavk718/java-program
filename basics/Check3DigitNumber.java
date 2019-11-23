import java.util.Scanner;
class Check3DigitNumber
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Plz enter a number :");
		long number=sc.nextLong();
		if(number>99&number<1000)
			System.out.println(number+" is 3 digit number");
		else
			System.out.println(number+" is not 3 digit number");
	}
}
