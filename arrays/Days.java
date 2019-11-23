//program to count how many days between to given dates??
class Days
{
	public static void main(String[]args)
	{
		Count_Days d1=new Count_Days(18,8,1947);
		Count_Days d1=new Count_Days(14,2,2019);
		int x=d1.number_Of_Days();
		int y=d2.number_Of_Days();
		System.out.println(x);
		System.out.println(y);
	}
class Count_Days
{
	int month[]={0,31,28,31,30,31,30,31,31,30,31,30,31};	
    int dd;
	int mm;
	int yy;
	public Count_Days(int dd,int mm,int yy)
	{
	    this.dd=dd;
		this.mm=mm;
		this.yy=yy;
		if(yy%400==0||yy%4==0&&yy%100!=0)
			month[2]=29;
	}
	public int number_Of_Days()
	{
		int days=dd;
		int y=yy-1;
		days=days+y*365;
		int leap=y/400+y/4-y/100;
		days=days+leap;
		for(int i=1;i<mm;i++)
		{
			days=days+month[i];
		}
		return days;
	}
}
}
		
		
		
		