import java.util.Scanner;
class RectanglePerimeter
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter length of rectangle");
		double length=sc.nextDouble();
		System.out.println("Please enter breadth of rectangle");
		double breadth=sc.nextDouble();
		double area=length*breadth;
		double perimeter=2*(length+breadth);
		System.out.println("Area of rectangle is " +area);
		System.out.println("Perimeter of rectangle is " +perimeter);
	}
}
