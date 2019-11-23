// program to read string from user count & display how many vowels,consonent,capital letter,small letter,digits and special character are present in the string??
import java.util.Scanner;
class Count_Display
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Sentence.");
		String str=sc.nextLine();
		int vc=0,cc=0,uc=0,lc=0,dc=0,spc=0;
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch>='A'&&ch<='Z')
			{
				uc++;
			if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
				vc++;
			else
				cc++;
			}
			else if(ch>='a'&&ch<='z')
			{
				lc++;
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
				vc++;
			else
				cc++;
			}
			else if(ch>='0'&&ch<='9')
				dc++;
			else 
				spc++;
		}
		System.out.print("\nNumber of vowel in the sentence is :"+vc);
		System.out.print("\nNumber of consonent in the sentence is :"+cc);
		System.out.print("\nNumber of upercase in the sentence is :"+uc);
		System.out.print("\nNumber of lowercase in the sentence is :"+lc);
		System.out.print("\nNumber of digit in the sentence is :"+dc);
		System.out.print("\nNumber of special character in the sentence is :"+spc);
	}
}

			
		
			
				
		

