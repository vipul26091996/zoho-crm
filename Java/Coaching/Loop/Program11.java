import java.util.*;
class Program11
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no.:");
		int n = sc.nextInt();		
		int i=1;
		long factor = 1;
		while(i<=n)
		{	
			factor = factor*i;	
			i++;
		}
		System.out.println(n+"! = "+factor);
	
	}
}