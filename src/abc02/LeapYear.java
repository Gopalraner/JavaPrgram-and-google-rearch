package abc02;

public class LeapYear {
public static void main(String[] args) 
{
	int year= 2022;
	if((year%4==0)&&(year%100!=0) || year%400==0)
			{
		System.out.println("2020 is laep year");
			}else {System.out.println("2020 is not leap year");}
}
}
