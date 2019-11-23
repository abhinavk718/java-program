import java.util.Scanner;
class CountBinaryDigit
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number.");
		int number=sc.nextInt();
	      int res=countDigits(number);
		  System.out.println("Binary digits in "+number+" is "+res);
	}
	static int countDigits(int num)
	{
		int count=0;
		while(num>0)
		{
			int r=num%10;
			if(r==0||r==1)
			count++;
			num=num/10;
		}
		return count;
	}
}
		