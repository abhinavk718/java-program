import java.util.Scanner;
class PrintPrimeNumber
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the range.");
		int range=sc.nextInt();
		for( int i=1;i<=range;i++)
		{
			if(isPrime(i))
				System.out.print(i+" ");
		}
	}
	static boolean isPrime(int n)
	{
		//for(int i=2;i<=n/2;i++)
			int i=2;
		while(i<=n/2)
		{
			if(n%i==0)
			return false;
		i++;
		}
		return true;
	}
}
	
		
		
	
				