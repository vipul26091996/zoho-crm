import java.util.*;
class Program12
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no. of A:");
		int a = sc.nextInt();
		System.out.println("Enter the no. of B:");
		int b = sc.nextInt();
		int power = 1;
		int i=1;

		while(i<=b)
		{	
			power = power*a;	
			i++;
		}
		System.out.println(power);
	
	}
}