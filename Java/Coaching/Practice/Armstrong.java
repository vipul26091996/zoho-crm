import java.util.Scanner;
class Armstrong 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number:");
		int n = sc.nextInt();
		int a = n;
		int x = countDigit(n);
		int sum = 0;
		System.out.println("Total Digit: "+x);
		while(n>0)
		{
			int r = n%10;
			sum = sum + findPower(r,x);
			n = n/10;
		}
		if(sum==a)
		{
			System.out.println("Armstrong number");
		}
		else
		{
			System.out.println("Not a Armstrong number");
		}
    	}
	public static int countDigit(int n)
	{
		int count = 0;
		for(;n>0;n=n/10)
		{
			count++;
		}
		return count;
	}
	public static int findPower(int n, int x)
	{
		int power=1;
		for(int i=1;i<=x;i++)
		{
			power = power*n;
		}
		return power;
	}
	
}