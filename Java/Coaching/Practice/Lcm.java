import java.util.*;
class Lcm
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
		int big = (a>b?a:b)>c?(a>b?a:b):c;
		for(i=big;;i+=big)
		{
			if(i%a==0 && i%b==0 && i%c==0)
			{
				System.out.println("LCM is: "+i);
				break;
			}
		}
	}	
}
