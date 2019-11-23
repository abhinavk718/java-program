/*
         1
		000
	   11111
	  0000000
	 111111111
	 */
	 import java.util.Scanner;
	 class Pattern18
	 {
		 public static void main(String[]args)
		 {
			 Scanner sc=new Scanner(System.in);
			 System.out.println("Enter the range.");
			 int n=sc.nextInt();
			 for(int i=1;i<=n;i++)
			 {
				 for(int j=1;j<=n-i;j++)
				 {
					 System.out.print(" ");
				 }
				 for(int j=1;j<=2*i-1;j++)
				 {
					 System.out.print(i%2);
				 }
				 System.out.println("");
			 }
		 }
	 }
	 
