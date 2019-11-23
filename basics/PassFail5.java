class PassFail5
{
	public static void main(String[] args)
	{
		String rs=getResult(45,59,86,37);
		System.out.println("Result is "+rs);
		String rs1=getResult(78,65,59,63);
		System.out.println("Result is "+rs1);
	}
	static String getResult(int m1,int m2,int m3,int m4)
	{
		if(m1<35||m2<35||m3<35||m4<35)
			return "fail";
		double per=(m1+m2+m3+m4)/4.0;
		if(per>85)
			return "distinction";
		if(per>60)
			return "first class";
		if(per>50)
			return "second class";
		return "pass";
	}
}
