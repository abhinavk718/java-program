//program to cheek two string is anagram or not??
import java.util.Scanner;
class Cheek_Anagram_String
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the FIRST string.");
		String st1=sc.nextLine();
		System.out.println("Enter the SECOND string.");
		String st2=sc.nextLine();
		boolean res=isAnagram(st1,st2);
		if(res)
			System.out.println("The given string is Anagram.");
		else
			System.out.println("The given string is not Anagram");
	}
	static boolean isAnagram(String str1,String str2)
	{
		int count1[]=new int[26];
		for(int i=0;i<str1.length();i++)
		{
			char ch=str1.charAt(i);
			if(ch>=65&&ch<=90)
				count1[ch-65]++;
			else if(ch>=97&&ch<=122)
				count1[ch-97]++;
		}
		int count2[]=new int[26];
		for(int i=0;i<str2.length();i++)
		{
			char ch=str2.charAt(i);
			if(ch>=65&&ch<=90)
				count2[ch-65]++;
			else if(ch>=97&&ch<=122)
				count2[ch-97]++;
		}
		for(int i=0;i<26;i++)
		{
			if(count1[i]!=count2[i])
				return false;
		}
		return true;
	}
}				