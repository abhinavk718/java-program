import java.util.Scanner;
class SimpleIntrest5
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the money.");
		int p=sc.nextInt();
		System.out.println("Enter the rate.");
		int r=sc.nextInt();
		System.out.println("Enter the time.");
	    int t=sc.nextInt();
		int si=simpleIntrest(p,r,t);
		System.out.println("Simple intrest of "+p+" is "+si);
		System.out.println("Total money with intrest is : "+(si+p));
	}
	static int simpleIntrest(int p,int r,int t)
	{
		int i=(p*r*t)/100;
		return i;
	}
}