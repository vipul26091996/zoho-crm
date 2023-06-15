package programfile;

import java.util.Scanner;

public class Program78 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String[] player = new String[11];
		for (int i = 0, j = 1; i < player.length; i++, j++) {
			System.out.println("Enter the " + j + " player name:");
			player[i] = sc.nextLine();
		}
		System.out.println("All the players name are: ");
		for (int i = 0, j = 1; i < player.length; i++, j++) {
			System.out.println(j + "- " + player[i]);
		}
		sc.close();

	}

}
