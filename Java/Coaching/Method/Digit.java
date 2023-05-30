import java.util.*;
class Digit
{
	public static void main(String[] args)
	{
		digit();
	}

	public static void digit()
	{
		int count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		while(n>0)
		{
			count++;
			n=n/10;
		}
		System.out.println(count);
		
	}
}