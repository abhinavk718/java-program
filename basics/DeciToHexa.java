import java.util.Scanner;
class DeciToHexa
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number.");
		int number=sc.nextInt();
		String res=deciToHexa(number);
		System.out.println(res);
	}
	 static String deciToHexa(int num)
	{
		String hex="";
		while(num>0)
		{
		   int r=num%16;
		    if(r<10)
			hex=r+hex;
		   else
		   {
			    switch(r)
			    {
				 case 10:
				 hex='A'+hex;
				 break;
				 case 11:
				 hex='B'+hex;
				 break;
				 case 12:
				 hex='C'+hex;
				 break;
				 case 13:
				 hex='D'+hex;
				 break;
				 case 14:
				 hex='E'+hex;
				 break;
				 case 15:
				 hex='F'+hex;
				 break;
			    }
		   }
			num=num/16;
		}
		return hex;
	}
}
		