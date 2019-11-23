import java.util.Scanner;
public class Swapping_Number
{
	public static void main(String []args)
	{   int z;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number.");
		int x=sc.nextInt();
		System.out.println("Enter the second number.");
		int y=sc.nextInt();
		System.out.println("Number before swapping are :");
		System.out.println(x+" "+y);
		z=x;
		x=y;
		y=z;
		System.out.println("Number after swapping are :");
		System.out.println(x+" "+y);
	}
}
		

