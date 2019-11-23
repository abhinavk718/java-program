import java.util.Scanner;
class StudentRecord
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println(" Please enter student name");
		String name=sc.nextLine();
		System.out.println(" Please enter math marks");
		double math=sc.nextDouble();
		System.out.println(" Please enter phycis marks");
		double phycis =sc.nextDouble();
		System.out.println(" Please enter chemistry marks");
		double chemistry=sc.nextDouble();
		System.out.println(" Please enter hindi marks");
		double hindi=sc.nextDouble();
		System.out.println(" Please enter english marks");
		double english=sc.nextDouble();
		double totalMarks=phycis+chemistry+hindi+english+math;
		System.out.println("Total marks of " +name+ " is " +totalMarks);
		double percentage=totalMarks/5;
		System.out.println(name+ " got " +percentage+ " percentage");
	}
}