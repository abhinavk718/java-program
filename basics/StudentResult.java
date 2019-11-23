import java.util.Scanner;
class StudentResult
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter four subjects marks :");
		int m1=sc.nextInt();
		int m2=sc.nextInt();
		int m3=sc.nextInt();
		int m4=sc.nextInt();
		double per=(m1+m2+m3+m4)/4.0 ;
		if(m1<35||m2<35||m3<35||m4<35)
			System.out.println("You are fail.");
		else
		{
			if(per>=85)
				System.out.println("pass with distinction");
			else if(per>=60&&per<=85)
				System.out.println("pass with first division");
			else if(per>=50&&per<60)
				System.out.println("pass with second division");
			else
				System.out.println("only pass");
		}
	}
}

				
		
