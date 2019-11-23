import java.util.Scanner;
class NameDemo
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Hii,what is your name?");
		String name=sc.nextLine();
		System.out.println("Hello "+ name + " How old are you?");
		int age=sc.nextInt();
		System.out.println("you know 5 year back your age was " +(age-5) + " and after 5 year it will become " +(age+5));
	}
}