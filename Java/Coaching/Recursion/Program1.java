import java.util.Scanner;
class Program1 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number A: ");
		int a = sc.nextInt();
		System.out.println("Enter the number B: ");
		int b = sc.nextInt();
		System.out.println("Enter the number C: ");
		int c = sc.nextInt();
		System.out.println("Enter the number D: ");
		int d = sc.nextInt();

		System.out.println("The Biggest number is: "+findBig(findBig(a,b),findBig(c,d)));
		
	}
	
	public static int findBig(int x, int y)
	{
		if(x>y)
		{
			return x;
		}
		else
		{
			return y;
		}	
	}

}