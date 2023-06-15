package programfile;

import java.util.Scanner;

public class Program86 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] retarr = createArray();
		for (int i = 0; i < retarr.length; i++) {
			System.out.println(retarr[i]);
		}

	}

	public static int[] createArray() {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter the " + i + " index value");
			arr[i] = sc.nextInt();
		}
		sc.close();
		return arr;
	}

}
