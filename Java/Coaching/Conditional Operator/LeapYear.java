import java.util.*;
class LeapYear
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year: ");
		int year=sc.nextInt();
		String result = (year%100!=0)&&(year%4==0)||(year%400==0)  ? year+" is Leap year" : year+" is not leap year";
		System.out.println(result);
		

	}
}