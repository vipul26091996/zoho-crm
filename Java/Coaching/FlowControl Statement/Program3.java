import java.util.*;

class Program3
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year");
		int a = sc.nextInt();
		if(a%100!=0)
		{		
			if(a%4==0)
			{
				System.out.println("Leap year: "+a);
			}
			else
			{
				System.out.println("Not a leap year: "+a);
			}
		}
		else
		{		
			if(a%400==0)
			{
				System.out.println("Leap year: "+a);
			}
			else
			{
				System.out.println("Not a leap year: "+a);
			}
		}
		

	}
}
