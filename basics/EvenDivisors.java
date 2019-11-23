 import java.util.Scanner;
 class EvenDivisors
 {
	 public static void main(String[]args)
	 {
		 int number,count=0,i=1;
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the number.");
		 number=sc.nextInt();
		 System.out.println("The number of even divisors under " +number+ " is :");
		 while(i<=number)
		 {
			 if(i%2==0&&number%i==0)
				count++;
			    i++;
		 }
		 System.out.print(count+ " ");
	 }
 }
		 