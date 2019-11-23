class MainExample1
{
    public static void main(String[] args)
	{
		int x=5;
		int y=x++ + ++x;
		System.out.println(x);
		System.out.println(y);
		int a=5;
		int b=a-- +a--;
		System.out.println(a);
		System.out.println(b);
	}
}
