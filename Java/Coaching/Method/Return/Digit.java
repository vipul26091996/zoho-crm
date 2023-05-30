import java.util.*;
class Digit
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter the number");
		int n = sc.nextInt();
		int x = checkDigit(n);
		System.out.println("Count is: "+x);
	}
	public static int checkDigit(int x)
	{
		int count=0;
		while(x>0)
		{
			count++;
			x=x/10;
		}
		return count;
		
	}
	

}
