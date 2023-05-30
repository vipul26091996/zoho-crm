import java.util.Scanner;
class Program2 
{

	public static void main(String[] args) 
	{

		System.out.println("Main mwthod starts");
		System.out.println(test(10));
		System.out.println("Main Methond ends");
		
	}
	
	public static String test(int x)
	{
		if(x>7)
		{
			System.out.println(x);
			return x+" "+test(x-1);
		}
		else
		{
			return x+" ";
		}	
	}

}