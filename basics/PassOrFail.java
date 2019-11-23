import java.util.Scanner;
class PassOrFail
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter four subject marks : " +" ");
		double m1=sc.nextInt();		
		double m2=sc.nextInt();
	    double m3=sc.nextInt();				
		double m4=sc.nextInt();
		if(m1<35||m2<35||m3<35||m4<35)
			System.out.println("Fail");
		else 
			System.out.println("Pass");
	}
}

			