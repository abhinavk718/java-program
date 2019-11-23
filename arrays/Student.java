public class Student
{
	void degree()
	{
		System.out.println("i got degree.");
	}
    public static class PostGraduate
	{
		void graduate()
		{
			System.out.println("i am postgraduate.");
		}
	}
    public static class UnderGraduate
	{
		void graduate()
		{
			System.out.println("i am an undergraduate.");
		}
	}
	public static void main(String[]args)
	{
		Student s=new Student();
		s.degree();
		PostGraduate pg=new PostGraduate();
		pg.graduate();
		UnderGraduate ug=new UnderGraduate();
		ug.graduate();
	}
}
		
			