import java.util.*;
class EvenSum
{
	public static void main(String[] args)
	{
		System.out.println("Main Method");
		int x = sumEven();
		System.out.println("Sum is: "+x);
	}
	public static int sumEven()
	{
		System.out.println("Even Method");
		int sum=0;
		int i=1;
		while(i<=100)
		{	
			if(i%2==0)
			{
			
				sum = sum + i ;
			
			}
			i++;
		}
		
		return sum;
		
	}
	

}
