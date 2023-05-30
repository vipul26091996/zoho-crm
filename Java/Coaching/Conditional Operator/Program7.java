import java.util.Scanner;
class Program7 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the character");
		char ch=sc.next().charAt(0);
		String result = (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')? "This is vowel":"This is not a vowel";

		System.out.println(result);
		
	}
}