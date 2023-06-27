package programfile;

public class Program70 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pattern1();
		System.out.println("==============");
		pattern2();

	}

	public static void pattern1() {
		for (int i = 1; i <= 5; i++) {
			if (i <= 3) {
				for (int j = 1; j <= i; j++) {
					System.out.print("*");
				}
			} else {
				for (int j = i; j <= 5; j++) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}

	public static void pattern2() {
		for (int i = 1; i <= 3; i++) {
			for (int j = 3; j > i; j--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 4; i <= 5; i++) {
			for (int j = 4; j <= i; j++) {
				System.out.print(" ");
			}
			for (int j = i; j <= 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
