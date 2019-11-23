import java.util.Scanner;
class OctalToDecimal
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the octal number.");
		int number=sc.nextInt();
		int res=octalToDecimal(number);
		System.out.println(res);
	}
	static int octalToDecimal(int num)
	{
		int octa=0,i=0;
		while(num>0)
		{
			int r=num%10;
			octa=octa+r*power(8,i);
			i++;
			num=num/10;
		}
		return octa;
	}
	static int power(int p,int q)
	{
		int pow=1;
		while(q>0)
		{
			pow=pow*p;
			q--;
		}
		return pow;
	}
}
