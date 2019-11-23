import java.util.Scanner;
import java.util.Random;
class NumberGuessGame
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		Random rn=new Random();
		int count=0;
		while(true)
		{
		   System.out.println("Guess any number from 0 to 9");
		   int number=sc.nextInt();
		   int rd=rn.nextInt(10);
		   count++;
		   if(number==rd)
		   {
			   System.out.println(number+ " == " +rd);
	           System.out.println("You won the game");
			   break;
		   }
		   else
		   {
			   System.out.println(number+ " != " +rd);
	           System.out.println("You lose the game");
		   }
		}
		 System.out.println("Thank you ,you have taken " +count+ " choices.");
	
	}
}
			