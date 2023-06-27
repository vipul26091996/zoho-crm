package programfile;

public class Program72 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pattern1();
		pattern2();

	}

	public static void pattern1() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				int sum = i + j;
				if (sum % 2 == 0) {
					System.out.print("1");
				} else {
					System.out.print("0");
				}
			}
			System.out.println();
		}
	}

	public static void pattern2() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
