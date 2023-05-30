import java.util.Scanner;
class Program5 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the character");
		char ch=sc.next().charAt(0);
		String result=((ch>='a'&&ch<='z')?"This is lowercase":"This is not lowercase");
		System.out.println(result);
		
	}
}