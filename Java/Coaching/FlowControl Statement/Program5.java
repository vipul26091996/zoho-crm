import java.util.*;

class Program5
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the character");
		char ch = sc.next().charAt(0);
				
		if(ch>=97 && ch<=122)
		{
			System.out.println("Lower case Alphabet: "+ch);
		}
		else if(ch>=65 && ch<=90)
		{
			System.out.println("Upper Case Alphabet: "+ch);
		}
		else 
		{
			System.out.println("Not a character: "+ch);
		}
		

	}
}
