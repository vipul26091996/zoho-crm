import java.util.*;

class Program10
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the side A:");
		int a = sc.nextInt();
		System.out.println("Enter the side B:");
		int b = sc.nextInt();
		System.out.println("Enter the side C:");
		int c = sc.nextInt();
				
		if(a+b>c && b+c>a && c+a>b)
		{
			System.out.println("Valid Triangle");
		}
		else 
		{
			System.out.println("Not a Valid Triangle");
		}
		
		
	}
}
