package programfile;

public class Program16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 0;
		for (int i = 35; i >= 11; i--) {
			if (i % 2 != 0) {
				n = i + n;
			}
		}
		System.out.println("Sum of the numbers is:" + n);

	}

}
