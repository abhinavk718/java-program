//program to display user entered number in the form of sentence??
import java.util.Scanner;
class Number_Sentence
{
    public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number.");
		int n=sc.nextInt();
		num_To_Word(n/10000000,"crore");
		num_To_Word(n/100000%100,"lakh");
		num_To_Word(n/10000%100,"Thousand");
		num_To_Word(n/100%10,"Hundred");
		num_To_Word(n%100," ");
	}
	private static void num_To_Word(int n,String st)
	{
		String []f={"","One","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen",
		                "fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
		String []s={"","","twenty","thirty","fourty","fifty","sixty","seventy","eighty","ninty"};
		if(n<20)
			System.out.print(f[n]);
		else
			System.out.print(s[n/10]+f[n%10]);
		if(n!=0)
			System.out.print(st+" ");
	}
}
 