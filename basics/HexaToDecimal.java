import java.util.Scanner;
class HexaToDecimal
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter hexadecimal number.");
		String number=sc.next();
		int res=hexaToDecimal(number);
        System.out.println(res);
	}
	static int hexaToDecimal(String num)
	{
		int deci=0,i=0;
		for(int t=num.length()-1;t>=0;t--)
		{
			char ch=num.charAt(t);
			if(ch>='A'&&ch<='F')
				deci=deci+(ch-55)*power(16,i);
			else if(ch>='a'&&ch<='f')
				deci=deci+(ch-87)*power(16,i);
			else
				deci=deci+(ch-48)*power(16,i);
			i++;
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
				
			
		
	