package programfile;

import java.util.Arrays;

public class Program119 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 3, 6, 7, 9, 5, 11 };
		int prime = 0;
		System.out.println(Arrays.toString(arr));
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (i == j) {

				} else {
					if (arr[i] % arr[j] == 0) {
						prime++;
g
					}
				}
			}
			if (prime == 0) {
				System.out.print(arr[i] + " ");
			}
		}

	}

}
