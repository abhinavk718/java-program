/*
      1
	 222
	33333
   4444444
  555555555
  */
  import java.util.Scanner;
  class Pattern21
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
			  for(int j=1;j<=(i+i)-1;j++)
			  {
				 System.out.print(i);
			  }
			  System.out.println("");
		  }
	  }
  }
		  