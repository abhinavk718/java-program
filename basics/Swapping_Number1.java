import java.util.Scanner;
public class Swapping_Number1
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number.");
		int x=sc.nextInt();
		System.out.println("Enter the second number.");
		int y=sc.nextInt();
		System.out.println("Number before swapping are :");
		System.out.println(x+" "+y);
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("Number after swapping are :");
		System.out.println(x+" "+y);
		sc.close();
	}
}