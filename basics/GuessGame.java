import java.util.Scanner;
import java.util.Random;
class GuessGame
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		Random rn=new Random();
		System.out.println("Enter any number from 0 to 9");
		int number=sc.nextInt();
		int rd=rn.nextInt(10);
		if(number==rd)
		{
			System.out.println(number+ " == " +rd);
	        System.out.println("You won the game");
		}
		else
		{
			System.out.println(number+ " != " +rd);
	        System.out.println("You lose the game");
		}
	}
}
			
	
		