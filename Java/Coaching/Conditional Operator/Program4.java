import java.util.Scanner;
class Program4 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the character");
		char ch=sc.next().charAt(0);
		String result=((ch>='a'&&ch<='z'||ch>='A'&&ch<='Z')?"This is Alphabet":"This is not Alphabet");
		System.out.println(result);
		
	}
}