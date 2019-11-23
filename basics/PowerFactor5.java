//define a method to return n to the power of p??
import java.util.Scanner;
class PowerFactor5
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value od n.");
		int n=sc.nextInt();
		System.out.println("Enter the value of p.");
		int p=sc.nextInt();
		int result=getPowerFactor(n,p);
		System.out.println(result);
	}
	static int getPowerFactor(int n,int p)
	{
		int pow=1;
		while(p>0)
		{
			pow=pow*n;
		     p--;
		}
		return pow;
	}
}