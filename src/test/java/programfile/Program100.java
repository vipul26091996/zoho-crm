package programfile;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5,6,7};
		List<Integer> lst = Arrays.stream(arr).boxed().toList();
		lst.remove(3);
		lst.toArray();
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(lst);
		}
	}

}
