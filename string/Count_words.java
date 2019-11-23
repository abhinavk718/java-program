//program to count number of words present in the given sentence??
import java.util.Scanner;
class Count_Words
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the sentence.");
		String st=sc.nextLine();
		int c=countWords(st);
		System.out.println("Total words in the given sentence is :"+c);
	}
	private static int countWords(String str)
	{
		char ch[]=str.toCharArray();
		int count=0;
		for(int i=0;i<ch.length;i++)
		{
			if(i==0&&ch[i]!=' '||ch[i]!=' '&&ch[i-1]==' ')
				count++;
		}
		return count;
	}
}
