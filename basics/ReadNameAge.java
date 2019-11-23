import java.util.Scanner;
class ReadNameAge
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Plz enter your name :");
		String name=sc.nextLine();
		System.out.print("Plz enter your age :");
		int age=sc.nextInt();
		if(age>=18)
			System.out.println(name+" is eligble for vote .");
		else
			System.out.println(name+" is not eligble for vote .");
	}
}
