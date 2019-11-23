// program to generate random number within 100 & check is it special two digit number or not??
import java.util.Random;
class RandomSpecialDigit
{
	public static void main(String[] args)
	{
		Random rc=new Random();
		int rn=rc.nextInt(100);
		int fd=rn/10;
		int ld=rn%10;
		System.out.println(rn);
		if(( fd+ld)+( fd*ld)==rn)
			System.out.println(rn+ " is special two number.");
		else
			System.out.println(rn+ " is not special two number.");
	}
}
