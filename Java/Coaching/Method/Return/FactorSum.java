import java.util.*;
class FactorSum
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter the number");
		int n = sc.nextInt();
		int x = sumFactor(n);
		System.out.println("Sum is: "+x);
	}
	public static int sumFactor(int x)
	{
		int sum=0;
		int i = 1;
		while(i<=x/2)
		{	
			if(x%i==0)
			{
				sum = sum+i;
			}			
			i++;
		}
		return sum;
		
	}
	

}
