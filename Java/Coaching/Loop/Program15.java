import java.util.*;
class Program15
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no.");
		int a = sc.nextInt();
		int sum = 0;
		int i=1;
		while(i<=a/2)
		{	
			if(a%i==0)
			{
				sum = sum + i;	
			}
			
			i++;
		}
		if(sum==a)
		{
			System.out.println("Perfect Number");
		}
		else
		{
			System.out.println("Not the Perfect Number");
		}
	
	}
}