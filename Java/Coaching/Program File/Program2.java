import java.util.*;
class Program2 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age:");
		int age = sc.nextInt();
		if(age>=1)
		{
			if(age>=18)
			{
				System.out.println("Eligible for Marry");
			}
			else
			{	
				System.out.println("Not eligible for marry");
			}
		}
		else
		{
			System.out.println("Invalid age");
		}

    	}
}