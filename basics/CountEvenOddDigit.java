import java.util.Scanner;
class CountEvenOddDigit 
{
	public static void main(String[] args)
	{
		long number,ld,ecount=0,ocount=0;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number.");
		number=sc.nextLong();
		while(number>0)
		{
			ld=number%10;
			if(ld%2==0)
				ecount++;
			else
				ocount++;
			    number=number/10;
		}
		System.out.println("Total number of even digits are :"+ecount);
		System.out.println("Total number of odd digits are :"+ocount);
	}
}

	