import java.util.*;
class DigitSum
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter the number");
		int n = sc.nextInt();
		int x = sumDigit(n);
		System.out.println("Sum is: "+x);
	}
	public static int sumDigit(int x)
	{
		int sum=0;
		while(x>0)
		{	
			int r = x%10;
			sum = sum + r;
			x=x/10;
			
			
		}
		return sum;
		
	}
	

}
