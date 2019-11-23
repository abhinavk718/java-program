import java.util.Scanner;
class reverseNumber5
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number.");
		int number=sc.nextInt();
		int rev=reverseNumber(number);
		System.out.println(rev);
	}
	 static int reverseNumber(int number)
	 {
		 int rn=0;
		 while(number!=0)
		 {
			 int ld;
			 ld=number%10;
			 rn=rn*10+ld;
			 number=number/10;
		 }
		 return rn;
	 }
}