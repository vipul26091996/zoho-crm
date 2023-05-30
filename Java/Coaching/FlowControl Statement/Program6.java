import java.util.*;

class Program6
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int a = sc.nextInt();
				
		if(a%55==0)
		{
			System.out.println("Divisible by 5 and 11 :"+a);
		}

		else 
		{
			System.out.println("Not divisible by 5 and 11: "+a);
		}
		

	}
}
