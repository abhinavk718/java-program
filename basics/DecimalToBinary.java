import java.util.Scanner;
class DecimalToBinary
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number.");
		int number=sc.nextInt();
		 String res=deciToBina(number);
		 System.out.println("Binary conversion of "+number+" is "+res);
	}
	static String deciToBina(int n)
	{
		String bin="";
		while(n>0)
		{
			int r=n%2;
			bin=r+bin;
			n=n/2;
		}
		return bin;
	}
}
