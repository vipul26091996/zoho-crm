package programfile;

import java.util.Arrays;

public class Program109 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 2, 6, 3, 5, 9, 1 };
		System.out.println(Arrays.toString(arr));
		System.out.println("The smallest element is: " + smallestElement(arr));
	}

	public static int smallestElement(int[] arr) {
		int temp;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr[0];
	}

}
