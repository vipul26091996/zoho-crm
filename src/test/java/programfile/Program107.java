package programfile;

public class Program107 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 2, 4, 7, 1, 8 };
		int temp;
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("The second smallest element is: " + arr[1]);

	}

}
