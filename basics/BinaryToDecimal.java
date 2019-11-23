import java.util.Scanner;
class BinaryToDecimal
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the binary number.");
		int number=sc.nextInt();
		int res=binaryToDecimal(number);
		System.out.println(res);
	}
	static int binaryToDecimal(int num)
	{
		int deci=0,i=0;
		while(num>0)
		{
			int r=num%10;
			deci=deci+r*power(2,i);
			i++;
			num=num/10;
		}
		return deci;
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
			
			
			
		