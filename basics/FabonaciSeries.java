import java.util.Scanner;
class FabonaciSeries
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number.");
		int n=sc.nextInt();
		int fn=0,ln=1,sum=0,t;
		for(int i=1;i<=n;i++)
		{
		sum=fn+ln;
		System.out.print(sum+" ");
		fn=ln;
		ln=sum;
		sum=fn;
		}
	}
}