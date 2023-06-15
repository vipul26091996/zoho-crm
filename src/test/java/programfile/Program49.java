package programfile;

import java.util.Scanner;

public class Program49 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char c;
		do {
			System.out.println("Enter the value of A:");
			int a = sc.nextInt();
			System.out.println("Enter the value of B:");
			int b = sc.nextInt();
			int value = add(a, b);
			if (value % 2 == 0) {
				System.out.println("Addition of A and B is even: " + value);
			} else {
				System.out.println("Addition of A and B is odd: " + value);
			}
			System.out.println("Do you want to continue: 'Y' ot 'N'");
			c = sc.next().charAt(0);
		} while (c == 'Y' || c == 'y');
		sc.close();
		System.out.println("Thanks");
	}

	public static int add(int x, int y) {
		int sum = x + y;
		return sum;
	}

}
