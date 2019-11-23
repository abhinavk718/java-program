import java.util.Scanner;
class LastTwoDigitNumber
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number : ");
		long number=sc.nextLong();
		if(number>99||number<-99)
	    number=number%100;
		System.out.print("last two digit is "+number+".");
	}
}