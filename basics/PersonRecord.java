 import java.util.Scanner;
 class PersonRecord
 {
	 public static void main(String[] args)
	 {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Please enter person name");
		 String name=sc.nextLine();
		 System.out.println("Please enter age of "+name);
         int age=sc.nextInt();
		 System.out.println("Please enter height of " +name);
		 double height=sc.nextDouble();
		 System.out.println("Please enter weight of " +name);
		 double weight=sc.nextDouble();
		 System.out.println("Please enter mobile number of " + name);
		 long number=sc.nextLong();
		 System.out.println("Name :" +name);
		 System.out.println("Age :" +age);
		 System.out.println("Height :" +height);
		 System.out.println("Weight :" +weight);
		 System.out.println("Mobile number :" +number);
	 }
 }
 