import java.util.Scanner;
class IsPlaindrome
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number.");
		int number=sc.nextInt();
	    boolean result=isPlaindrome(number);
		if(result)
			System.out.println("plaindrome number.");
		else
			System.out.println(" not plaindrome number.");
	}
	static boolean isPlaindrome(int number)
	{
		int ld,rn=0,t=number;
		while(number!=0)
		{
			ld=number%10;
			rn=rn*10+ld;
			number=number/10;
		}
		if(rn==t)
			return true;
		else
			return false;
	}
}
