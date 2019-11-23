//program to display how many character present in each word in the given sentence??
import java.util.Scanner;
class Count_Character
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the sentence.");
		String st=sc.nextLine();
		int res=countCharacter(st);
		System.out.println(res);
	}
	private static int countCharacter(String str)
	{
		char ch[]=str.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			String s="";
			while(i<ch.length&&ch[i]!=' ')
			{
				s=s+ch[i];
				i++;
			}
			if(s.length()>0)
			{
				System.out.println(s+"--->"+s.length());
			}
			return s.length();
		}
	}
}

				
			