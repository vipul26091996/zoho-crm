import java.util.*;

class Program8
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the character");
		char ch = sc.next().charAt(0);
				
		if(ch>=97 && ch<=122 || ch>=65 && ch<=90)
		{
			System.out.println("Alphabet: "+ch);
		}
		else if(ch>=48 && ch<=57)
		{
			System.out.println("Digit: "+ch);
		}
		else 
		{
			System.out.println("Special character: "+ch);
		}
		
		
	}
}
