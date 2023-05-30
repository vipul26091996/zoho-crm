import java.util.*;
class Program1
{
	public static void main(String[] args)
	{
		prime();
	}

	public static void prime()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		int count=0;
		int i=1;
		while(i<n/2)
		{
			if(n%i==0)
			{
				count++;
			}
			i++;
		}
			if(count==1)
			{
				System.out.println("Prime");
			}
			else
			{
				System.out.println("Not a Prime");
			}
		
	}
}