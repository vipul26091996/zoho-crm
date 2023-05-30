import java.util.*;
class Hcf
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number A");
		int a = sc.nextInt();
		System.out.println("Enter the Number B");
		int b = sc.nextInt();
		System.out.println("Enter the Number C");
		int c = sc.nextInt();
		int i;
		int small = (a<b?a:b)<c?(a<b?a:b):c;
		for(i=small;;i--)
		{
			if(a%i==0 && b%i==0 && c%i==0)
			{
				System.out.println("HCF is: "+i);
				break;
			}
		}
	}	
}
