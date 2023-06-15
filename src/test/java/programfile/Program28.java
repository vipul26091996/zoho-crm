package programfile;

import java.util.Scanner;

public class Program28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char c;
		Scanner sc = new Scanner(System.in);
		do {
			int num = 0;
			System.out.println("Enter the number:");
			int n = sc.nextInt();
			while (n > 0) {
				int rem = n % 10;
				num = num * 10 + rem;
				n = n / 10;
			}
			System.out.println("Reverse: " + num);
			System.out.println("Do you want to continue: 'Y' or 'N'");
			c = sc.next().charAt(0);
		} while (c == 'y' || c == 'Y');
		sc.close();
		System.out.println("Thanks");
	}

}
