import java.util.Scanner;
class DecimalToHexa
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number.");
		int number=sc.nextInt();
		String res=deciOcta(number);
		System.out.println("Decimal to octal conversion is "+res);
	}
	static String deciOcta(int num)
	{
		 String octa="";
		 while(num>0)
		{
			int r=num%16;
			octa=r+octa;
			num=num/16;
		}
		return octa;
	}
} 