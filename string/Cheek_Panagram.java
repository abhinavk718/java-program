//program to cheek the given string is panagram or not??
import java.util.Scanner;
class Cheek_Panagram
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the sentence.");
		String st=sc.nextLine();//The quick brown fox jumps over the lazy dog
		boolean res=isPanagram(st);
		if(res)
			System.out.println("String is panagram.");
		else
			System.out.println("String is not panagram.");
	}
	static boolean isPanagram(String str)
	{
		if(str.length()<26)
			return false;
		int []count=new int[26];
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch>=65&&ch<=90)
				count[ch-65]++;
			else if(ch>=97&&ch<=122)
				count[ch-97]++;
		}
		for(int i=0;i<count.length;i++)
		{
			if(count[i]==0)
				return false;
		}
		return true;
	}
}
