class EligibilityCheck
{
	static void eligible(int age)
	{
		if(age>=18)
			System.out.println("You are eligible to vote.");
		else
			System.out.println("You are not eligible to vote.");
	}
	public static void main(String[]args)
	{
		eligible(89);
	}
}