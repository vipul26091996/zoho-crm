package programfile;

import java.util.Scanner;

public class Program79 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int[] element = new int[5];
		for(int i=0;i<element.length;i++)
		{
			System.out.println("Enter the "+i+" index value:");
			element[i]=sc.nextInt();
		}
		System.out.println("The reverse order is:");
		for(int i=(element.length-1);i>=0;i--)
		{
			System.out.print(element[i]+" ");
		}
		sc.close();
	}

}
