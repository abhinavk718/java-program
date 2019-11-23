import java.util.Scanner;
class DecimalToHexaNumber
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number.");
		int number=sc.nextInt();
		String res=decimalToHexa(number);
		System.out.println(res);
	}
	static String decimalToHexa(int num)
	{
		String hex="";
		while(num>0)
		{
			int r=num%16;
			if(r<10)
				hex=r+hex;
			else
				hex=(char)(r+55)+hex;
			num=num/16;
		}
		return hex;
	}
}
			
		
