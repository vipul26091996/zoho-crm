import java.util.*;
class Program14
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no.");
		int a = sc.nextInt();
		
		int i=1;
		while(i<=a)
		{	
			int j = 1;
			while(j<=10)
			{
				System.out.println(i+"*"+j+"= "+(i*j));
				j++;
			}
			System.out.println("=========================");
			i++;
		}
	
	}
}