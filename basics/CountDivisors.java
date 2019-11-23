import java.util.Scanner;
class CountDivisors
{
	public static void main(String[] args)
	{
		int number,i=1,count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number.");
	    number=sc.nextInt();
		System.out.println("The devisors of " +number + " is :");
		while(i<=number/2)
		{
			if(number%i==0)
			{
			    System.out.print(i+ " ");
				count++;
			}
			    i++;
		}
		System.out.println("\nThe total number of divisior of "+number+ " is " +count+".");
		
	}
}
