import java.util.Scanner;
class Check_Plaindrome
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number.");
		int n=sc.nextInt();
		boolean res=is_Plaindrome(n);
		if(res)
			System.out.println("Plaindrome number.");
		else
		   System.out.println("not Plaindrome number.");	
	}
    static boolean is_Plaindrome(int a)
	{
		int r,rev=0,t=a;
		while (a>0)
		{
			r=a%10;
			rev=rev*10+r;
			a=a/10;
		}
		return rev==t;
	}
}
