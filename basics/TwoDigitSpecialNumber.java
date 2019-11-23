import java.util.Scanner;
class TwoDigitSpecialNumber
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter two digit number : ");
		int number=sc.nextInt();
		int d1=number/10;
		int d2=number%10;
		if((d1+d2)+(d1*d2)==number)
			System.out.println(number+" is two digit special number");
		else
		    System.out.println(number+" is not two digit special number");
	}
}
