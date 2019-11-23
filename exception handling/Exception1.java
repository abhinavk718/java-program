class Exception1
{
	static void divide(int x,int y)
	{
		try
		{
		int res=x/y;
		System.out.println("Quotient is :"+res);
		}
		catch(ArithmeticException e)
		{
			System.out.println("sorry divide by zero ---- Good luck for nextTime.");
		}
	}
	public static void main(String[] args)
	{
		System.out.println("Main method started.");
		divide(12,4);
		divide(4,0);
		divide(65,5);
		divide(16,4);
		divide(12,0);
		System.out.println("Main method END.");
	}
}
		
		