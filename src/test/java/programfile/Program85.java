package programfile;

import java.util.Scanner;

public class Program85 {

	static Scanner sc = new Scanner(System.in);
	static int[] arr = new int[10];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		createArray();
		readArray();

	}

	public static void createArray() {

		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter the " + i + " index value");
			arr[i] = sc.nextInt();
		}
	}

	public static void readArray() {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
