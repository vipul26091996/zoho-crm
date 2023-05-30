import java.util.*;

class Program7
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an alphabet");
		char ch = sc.next().charAt(0);
				
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
		{
			System.out.println("Lower Case Vowel: "+ch);
		}
		else if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
		{
			System.out.println("Upper Case Vowel: "+ch);
		}
		else 
		{
			System.out.println("Not a Vowel: "+ch);
		}
		

	}
}
