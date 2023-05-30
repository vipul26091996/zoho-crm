import java.util.*;

class Program13
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of A:");
		int a = sc.nextInt();
		System.out.println("Enter the value of B:");
		int b = sc.nextInt();
		System.out.println("Enter the value of C:");
		int c = sc.nextInt();

		double d = b*b-4*a*c;
				
		if(d>=0)
		{
		
			System.out.println("Real roots are possible");
			double x =(-b+Math.sqrt(d))/(2*a);
			double y =(-b-Math.sqrt(d))/(2*a);
			System.out.println("First root is: "+x);
			System.out.println("Second root is: "+y);
		
		}
		else 
		{
			System.out.println("Real root are not possible");
		}
		
		
	}
}
