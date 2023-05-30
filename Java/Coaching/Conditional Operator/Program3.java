import java.util.Scanner;
class Program3 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of A:");
		int a=sc.nextInt();
		System.out.println("Enter the value of B:");
		int b=sc.nextInt();
		System.out.println("Enter the value of C:");
		int c=sc.nextInt();
		System.out.println("Enter the value of D:");
		int d=sc.nextInt();
		int x=(a>b)?a:b;
		int y=(c>d)?c:d;
		int result = x>y?x:y;
		System.out.println("Largest number=" +result);
		
	}
}