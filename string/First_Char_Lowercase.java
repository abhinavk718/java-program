//program to convert every word first character into small and remaning are in capital??
import java.util.Scanner;
class First_Char_Lowercase
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the sentence.");// ram is a good boy
		String st=sc.nextLine();
		String res=first_Char_Lowercase(st);
		System.out.println(res);
	}
	private static String first_Char_Lowercase(String str)
	{
		char ch[]=str.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(i==0&&ch[i]!=' '||ch[i]!=' '&&ch[i-1]==' ')
			{
				if(ch[i]>='A'&&ch[i]<='Z')
				{
					ch[i]=(char)(ch[i]+32);
				}
			}
			else
			{
				if(ch[i]>='a'&&ch[i]<='z')
				{
					ch[i]=(char)(ch[i]-32);
				}
			}
		}
		return new String(ch);
	}
}
