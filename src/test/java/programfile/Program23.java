package programfile;
import java.util.Scanner;
public class Program23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of A:");
		int a = sc.nextInt();
		System.out.println("Enter the value of B:");
		int b =sc.nextInt();
		int temp = a;
		a=b;
		b=temp;
		System.out.println("A: "+a+" B: "+b);
		sc.close();
	}

}
