import java.util.Scanner;
class EligibilityCheck1
{
	void eligible(int age)
	{
		if(age>=18)
		   System.out.println(" You are eligible to vote.");
		else
		System.out.println("You are not eligible to vote.");
	}
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the age :");
		int age=sc.nextInt();
		EligibilityCheck1 e=new EligibilityCheck1();
		e.eligible(age);
	}
}