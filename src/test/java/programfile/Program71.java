package programfile;

public class Program71 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 1; i <= 4; i++) {
			for (int j = 3; j >= i; j--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= 2 * i - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 5; i <= 7; i++) {
			for (int j = 5; j <= i; j++) {
				System.out.print(" ");
			}
			for (int j = 13; j >= 2 * i - 1; j--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
