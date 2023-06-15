package programfile;

public class Program69 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		pattern1(9);
		System.out.println("=============================");
		pattern2(9);
		System.out.println("=============================");
		pattern3(9);""
		System.out.println("=============================");
	}

	public static void pattern1(int row) {
		for (int i = 1; i <= row; i++) {
			for (int j = row; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void pattern2(int row) {
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void pattern3(int row) {
		int col = 9;
		for (int i = 1; i <= row; i++) {
			for (int spc = i; spc < col; spc++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
