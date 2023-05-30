import java.util.*;

class Program4
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the character");
		char ch = sc.next().charAt(0);
				
		if(ch>=97 && ch<=122 || ch>=65 && ch<=90)
		{
			System.out.println("An Alphabet: "+ch);
		}
		else
		{
			System.out.println("Not an Alphabet: "+ch);
		}
		

	}
}
