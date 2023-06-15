package programfile;

import java.util.Scanner;

public class Program21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char c;
		Scanner sc = new Scanner(System.in);
		do {
			int n = 0;
			System.out.println("Enter the number");
			int num = sc.nextInt();
			while (num > 0) {
				int rem = num % 10;
				if (rem % 2 == 0) {
					n = n + rem;
					
				}
				num = num / 10;
			}
			System.out.println(n);
			System.out.println("Do you want to continue: 'Y' or 'N'");
			c = sc.next().charAt(0);
		} while (c == 'Y' || c == 'y');
		sc.close();
		System.out.println("Thanks");
	}

}
