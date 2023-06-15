package programfile;

import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {

		char c;
		Scanner sc = new Scanner(System.in);
		do {
		System.out.println("Enter the age");
		int n = sc.nextInt();
		if (n >= 18) {
			System.out.println("Eligible to marry");
		} else {
			if (n <= 0) {
				System.out.println("Enter the correct age");
			} else {
				System.out.println("Not Eligible to marry");
			}
		}
		System.out.println("Do you want to continue: Y or N");
		c = sc.next().charAt(0);
		}while(c=='Y'||c=='y');
		sc.close();
		System.out.println("Thanks");
	}
}
