import java.util.Scanner;
class CheckPlaindrome
{
	public static void main(String[]args)
	{
		int number,r,rn=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number.");
		number=sc.nextInt();
		int t=number;
		while(t!=0)
		{
			r=t%10;
			rn=rn*10+r;
			t=t/10;
		}
		if(rn==number)
			System.out.println(number+" is plaindrome number.");
		else
		    System.out.println(number+" is not plaindrome number.");
	}
}

		
		