package programfile;

import java.util.Scanner;

public class Program25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char c;
		Scanner sc = new Scanner(System.in);
		do {
			int count = 0;
			System.out.println("Enter the number:");
			int n = sc.nextInt();
			while (n > 0) {
				int num = n % 10;
				if (num > 0) {
					count++;
				}
				n = n / 10;
			}
			System.out.println("Digits are: " + count);
			System.out.println("Do you want to continue");
			c = sc.next().charAt(0);
		} while (c == 'y' || c == 'Y');
		sc.close();
		System.out.println("Thanks");

	}

}
