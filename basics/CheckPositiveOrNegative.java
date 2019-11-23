import java.util.Scanner;
class  
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Plz enter a number :");
		double number=sc.nextDouble();
		if(number>0)
			System.out.println(number+" is positive number");
		else if(number==0)
			System.out.println(" number is zero");
		
		else
			System.out.println(number+" is negative number");
	}
}
