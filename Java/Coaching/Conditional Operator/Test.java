import java.util.Scanner;
class Test {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value:");
		int a=sc.nextInt();
		System.out.println("Enter the value:");
		int b=sc.nextInt();
		System.out.println("Enter the value:");
		int c=sc.nextInt();
		System.out.println("Enter the value:");
		int d=sc.nextInt();
		System.out.println("Enter the value:");
		int e=sc.nextInt();

		//int x= a>b?a:b; for two value comparison
		//int y = x>b?x:b; for three value comparison
		//y = (a>b?a:b)>b?(a>b?a:b):b; 
		//int z = ((a>b?a:b)>c?(a>b?a:b):c)>d?((a>b?a:b)>c?(a>b?a:b):c):d; for four value comparison


		int result= (((a>b?a:b)>c?(a>b?a:b):c)>d?((a>b?a:b)>c?(a>b?a:b):c):d)>e?(((a>b?a:b)>c?(a>b?a:b):c)>d?((a>b?a:b)>c?(a>b?a:b):c):d):e; //for five value comparison
		

		System.out.println("The biggest number is: "+result);
		
	}
}