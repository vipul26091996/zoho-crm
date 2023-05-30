import java.util.*;

class Program11
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the angle A:");
		int a = sc.nextInt();
		System.out.println("Enter the angle B:");
		int b = sc.nextInt();
		System.out.println("Enter the angle C:");
		int c = sc.nextInt();
		int sum = a+b+c;
				
		if(sum==180)
		{
			System.out.println("Valid Triangle");
		}
		else 
		{
			System.out.println("Not a Valid Triangle");
		}
		
		
	}
}
