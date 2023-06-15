package programfile;

public class Program55 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	}

	public static String factorialofEachDigit(int x)
	{	
		while(x>0)
		{
		int fact=1;
		int rem=x%10;
		for(int i=rem;i>0;i--)
		{
			fact=fact*i;
		}
		//System.out.println("factorial of "+rem+" is "+fact);
		x=x/10;
		return "factorial of "+rem+" is "+fact;
		}
	}
}
