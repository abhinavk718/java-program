import java.util.Scanner;
class ProblemSolving
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Plz enter a number :");
		long number=sc.nextLong();
		if(number%3==0&number%5!=0)
			System.out.println("Sanju");
		else if(number%5==0&number%3!=0)
			System.out.println("Geeta");
		else if(number%3==0&number%5==0)
			System.out.println(" Sanju Weds Geeta");
		else 
			System.out.println("Breakup");
	}
}

		