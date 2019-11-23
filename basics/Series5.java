import java.util.Scanner;
class Series5
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the range.");
		int n=sc.nextInt();
		int i=1;
		while(i<=n)
		{
			int res=power(i,i);
			System.out.print(res+" ");
			i++;
		}
	}
	static int power(int p,int q)
	{
		int pow=1;
		while(q>0)
		{
			pow=pow*p;
			q--;
		}
		return pow;
	}
}
			
	
		