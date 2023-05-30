import java.util.Scanner;
class Program2 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of A:");
		int a=sc.nextInt();
		System.out.println("Enter the value of B:");
		int b=sc.nextInt();
		System.out.println("Enter the value of C:");
		int c=sc.nextInt();
		int d=(a>b)?a:b;
		String result =(d>c)?d:c;
		System.out.println("Largest number=" +result);
		
	}
}