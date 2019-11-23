import java.util.Scanner;
class MiddleNumber
{
	public static void main(String[] args)
	{
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 3 numbers.");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		if(a>b&&a<c||a>c&&a<b)
			System.out.println(a+" is middle number.");
		else
		{
			if(b>a&&b<c||b<a&&b>c)
				System.out.println(b+" is middle number.");
			else
				System.out.println(c+" is middle number.");
		}
	}
}
				