import java.util.*;
class Program58 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int n = sc.nextInt();
		int check=0;
		if(n>=1 && n<=1000)
		{
			for(int x=n;x>=1;x=n/10)
			{
				int fact=1;
				x = n%10;
				for(int i=x;x>=1;x--)
				{
					fact = fact*x;
				}
				check=check+fact;
				
			}
			if(check==n)
			{
				System.out.println("Strong Number");	
			}
			else
			{
				System.out.println("Not a Strong Number");
			}					
		}
		else
		{
			System.out.println("Enter the number between 1 - 1000");
		}

    	}
}