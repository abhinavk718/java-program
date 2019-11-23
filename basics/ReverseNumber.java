import java.util.Scanner;
class ReverseNumber
{
	public static void main(String[] args)
	{
		int number,rn=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number.");
		number=sc.nextInt();
		while(number!=0)
		{
			int r=number%10;
			rn=rn*10+r;
			number=number/10;
		}
	     System.out.print(rn);
	}
}

		
		
		
