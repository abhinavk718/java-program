//program to reverse the word in the given sentence??
import java.util.Scanner;
class Reverse_Word
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the stentence.");
		String st=sc.nextLine();
		String rs="";
		char []ch=st.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			int j=i;
			while(i<ch.length&&ch[i]!=' ')
			{
				i++;
			}
			int k=i-1;
			while(k>=j)
			{
				rs=rs+ch[k];
				k--;
			}
			if(i<ch.length)
				rs=rs+ch[i];
		}
		System.out.println(rs);
	}
}

				