class CircleArea6
{
	public static void main(String[] args)
	{
		dispCircleArea(5.8);
		dispCircleArea(3.6);
		dispCircleArea(7.3);
		dispCircleArea(8.4);
		dispCircleArea(8);
	}
	static void dispCircleArea(double r)
	{
		System.out.println("Radius is :"+r);
		double ar=3.143*r*r;
		System.out.println("Area is :"+ar);
	}
}
		