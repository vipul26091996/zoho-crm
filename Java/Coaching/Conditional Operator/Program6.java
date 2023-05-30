import java.util.Scanner;
class Program6 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int x=sc.nextInt();
		String result = (x%55==0)?"this is divisible":"this is not divisible";

		System.out.println(result);
		
	}
}