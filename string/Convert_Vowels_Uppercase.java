//program to convert all the vowels in the given String in uppercase??
import java.util.Scanner;
class Convert_Vowels_Uppercase
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the sentence.");
		String st=sc.nextLine();
	    String res=ConvertVowels_Uppercase(st);
		System.out.println(res);
	}
	private static String ConvertVowels_Uppercase(String str)
	{
		char ch[]=str.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(i==0&&ch[i]!=' '||ch[i]!=' '&&ch[i-1]==' ')
			{
				if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
				{
					ch[i]=(char)(ch[i]-32);
				}
				else
				{
					ch[i]=ch[i];
					
				}
			}
		}
		return new String(ch);
	}
}