package programfile;

import java.util.Arrays;

public class Program110 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr= {3,7,1,5,9,2};
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(sortDescending(arr)));
		
		
	}

	public static int[] sortDescending(int[] arr)
	{
		int temp;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]<arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
	return arr;
	}
}
