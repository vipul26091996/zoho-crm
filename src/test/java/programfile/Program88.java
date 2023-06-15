package programfile;

public class Program88 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 43, 32, 5, 4, 54, 64, 43, 32, 32 };
		int n = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (n <= arr[i]) {
				n = arr[i];
			}
		}
		System.out.println("Largest no is: " + n);

	}

}
