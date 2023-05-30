import java.util.*;
class Factors
{
	public static void main(String[] args)
	{
		factor();
	}

	public static void factor()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter the number");
		int n = sc.nextInt();
		int sum=0;
		int count=0;
		for(int i=1;i<=n/2;i++)
		{
			if(n%i==0)
			{
				sum = sum+i;
				count++;
			}

		}
		System.out.println("Total Count is: "+count);
	}
}