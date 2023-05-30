import java.util.*;

class Program2
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 1st number");
		int a = sc.nextInt();
		System.out.println("Enter the 2nd number");
		int b = sc.nextInt();
		System.out.println("Enter the 3rd number");
		int c = sc.nextInt();
		System.out.println("Enter the 4th number");
		int d = sc.nextInt();
		
		if(a>b && a>c && a>d)
		{
			System.out.println("Biggest number is: "+a);
		}
		else if(b>c && b>d)
		{
			System.out.println("Biggest number is: "+b);
		}
		else if(c>d)
		{
			System.out.println("Biggest number is: "+c);
		}
		else
		{
			System.out.println("Biggest number is: "+d);
		}
		

	}
}
