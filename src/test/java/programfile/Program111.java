package programfile;

import java.util.Arrays;

public class Program111 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 2, 4, 6, 7, 9, 2, 6 };
		System.out.println(Arrays.toString(arr));
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.println(arr[i]);
				}
			}
		}

	}

}
