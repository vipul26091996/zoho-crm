package programfile;

public class Program94 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int n = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (i % 2 == 0) {
				if (n < arr[i]) {
					n = arr[i];
				}
			}
		}
		System.out.println(n);
	}
}
