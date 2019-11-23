//write a program to find nth biggest number in an array??
import java.util.Scanner;
class Nth_Biggest_Number
{
	public static void main(String[]args)
	{
		Scanner sc=new ScannerK(System.in);
		System.out.println("Plz enter how many elements you have to store in an array.");
		int n=sc.nextInt();
		int x[]=new int[n];
		System.out.println("plz enter "+n+"elements.");
		for(int i=0;i<x.length;i++)
		{
			x[i]=sc.nextInt();
		}
	}
	static int nth_Biggest(int[]a,int n)
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if(a[i]>)
		