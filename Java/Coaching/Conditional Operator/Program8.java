import java.util.Scanner;
class Program8 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the side A:");
		int a=sc.nextInt();
		System.out.println("Enter the side B:");
		int b=sc.nextInt();
		System.out.println("Enter the side C:");
		int c=sc.nextInt();
		String result= (a+b>c && c+a>b && b+c>a)?"This is triangle":"This is not triangle";
		System.out.println(result);
		
	}
}