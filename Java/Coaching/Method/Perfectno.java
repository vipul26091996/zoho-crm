import java.util.*;
class Perfectno
{
	public static void main(String[] args)
	{
		perfectNo();
	}

	public static void perfectNo()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter the number");
		int n = sc.nextInt();
		int sum=0;
		for(int i=1;i<=n/2;i++)
		{
			if(n%i==0)
			{
				sum = sum+i;
			}

		}
		if(n==sum)
		{
			System.out.println("Perfect Number");
		}
		else
		{
			System.out.println("Not a perfect number");
		}
	}
}