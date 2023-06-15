package programfile;

public class Program15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 0;
		for (int i = 20; i >= 10; i--) {
			if (i % 2 == 0) {
				n = i + n;
			}
		}
		System.out.println("Sum of the numbers is:" + n);

	}

}
