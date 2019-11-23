import java.util.Scanner;
class ProductArray
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many elements you have to store.");
		int n=sc.nextInt();
		int x[]=new int[n];
		System.out.println("Plz Enter "+n+" elements.");
		for(int i=0;i<n;i++)
		{
			x[i]=sc.nextInt();
		}
		int pro=productArray(x);
		System.out.println("Product of array elements are :"+pro);
	}
	static int productArray(int[]y)
	{
		int product=1;
		for(int j=0;j<y.length;j++)
		{
			product=product*y[j];
		}
		return product;
	}
}
		