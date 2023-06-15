package programfile;

import java.util.Scanner;

public class Program17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char c;
		do {
			long reverse = 0;
			System.out.println("Enter the number:");
			long n = sc.nextLong();
			while (n>0) {
				long i = n % 10;
				reverse = reverse * 10 + i;
				n = n / 10;
			}
			System.out.println("Reverse is: " + reverse);
			System.out.println("Do you want to continue: 'Y' or 'N'");
			c = sc.next().charAt(0);
		} while (c == 'Y' || c == 'y');
		sc.close();
		System.out.println("Thanks");
	}
}
