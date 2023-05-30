import java.util.*;
class Program13
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no.");
		int a = sc.nextInt();
		
		int i=1;
		while(i<=10)
		{	
			
			System.out.println(a+"*"+i+"= "+(a*i));
			
			i++;
		}
	
	}
}