package programfile;

import java.util.Scanner;

public class Program24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char c;
		do {
			System.out.println("Enter the value of A:");
			int a = sc.nextInt();
			System.out.println("Enter the value of B:");
			int b = sc.nextInt();
			a = a * b;
			b = a / b;
			a = a / b;
			System.out.println("A: " + a + ", B: " + b);
			System.out.println("Do you want to continue");
			c = sc.next().charAt(0);
		} while (c == 'Y' || c == 'y');
		sc.close();
		System.out.println("Thanks");

	}

}
