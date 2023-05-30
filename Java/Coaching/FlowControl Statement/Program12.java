import java.util.*;

class Program12
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
			if(a!=b && b!= c && a!=c)
			{
				System.out.println("Scalene triangle");
			}
			else if(a==b && b==c && a==c)
			{
				System.out.println("Equilateral triangle");
			}
			else
			{
				System.out.println("Isosceles triangle");
			}
		}
		else 
		{
			System.out.println("Not a Valid Triangle");
		}
		
		
	}
}
