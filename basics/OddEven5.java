import java.util.Scanner;
class OddEven5
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number :");
		int number=sc.nextInt();
		String s[]={"even","odd"};
		System.out.println(number+" is "+s[number%2]+" number");
	}
}
