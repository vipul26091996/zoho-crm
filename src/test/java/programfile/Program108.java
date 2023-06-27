package programfile;

import java.util.Arrays;

public class Program108 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 9, 6, 4, 2, 8, 5, 1 };
		System.out.println(Arrays.toString(arr));
		System.out.println("The second largest element is: " + secondLargest(arr));
	}

	public static int secondLargest(int[] arr) {
		int temp;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr[1];
	}

}
