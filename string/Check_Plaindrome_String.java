//program to define a method to check the given String is plaindrome or not without reversing??
import java.util.Scanner;
class Check_Plaindrome_String
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the word.");
		String str=sc.next();
		boolean res=isPlaindrome(str);
		if(res)
			System.out.println(str+" is plaindrome string.");
		else
            System.out.println(str+" is not plaindrome string.");	
	}
	static private boolean isPlaindrome(String str)
	{ 
	    int i=0; 
		int n=str.length()-1;
		while(i<n)
		{
			if(str.charAt(i)!=str.charAt(n))
				return false;
			i++;
			n--;
		}
		return true;
	}	
}