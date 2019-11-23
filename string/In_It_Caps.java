//write a program to convert first character of the words in uppercase???
import java.util.Scanner;
class In_It_Caps
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the sentence.");
		String st=sc.nextLine();
		String res=inItCaps(st);
		System.out.println(res);
	}
	private static String inItCaps(String str)
	{
		char ch[]=str.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(i==0&&ch[i]!=' '||ch[i]!=' '&&ch[i-1]==' ')
			{
				if(ch[i]>='a'&&ch[i]<='z')
				{
					ch[i]=(char)(ch[i]-32);
				}
			}
			else
			{
				if(ch[i]>='A'&&ch[i]<='Z')
				{
				  ch[i]=(char)(ch[i]+32);
			    }
			}
		}
		return new String(ch);
	}
}

		