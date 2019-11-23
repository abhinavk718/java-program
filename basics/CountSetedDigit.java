import java.util.Scanner;
class CountSetedDigit
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number.");
		int number=sc.nextInt();
		int res=countSeted(number);
		System.out.println("Seted digits in "+number+" is "+res);
	}
	static int countSeted(int num)
	{
		int count=0;
		while(num>0)
		{
		    String bin="";
			int r=num%2;
			bin=r+bin;
			if(r==1)
			count++;
			num=num/2;
		}
		return count;
	}
}
	