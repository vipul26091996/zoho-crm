package programfile;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Program101 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {1,2,3,4,5,6,7};
		int index =3;
		
	}
	
	public static int[] removeElement(int[] arr, int index)
	{
		if(arr==null||index<0||index>=arr.length)
		{
			return arr;
		}
		List<Integer> lst = Arrays.stream(arr).boxed().toList();
		lst.remove(index);
		int[] arr2 = new int[4];
		int[] newarr = lst.toArray(arr2);
		//System.arraycopy(arr, index, arr, index, index);
		return newarr;
	}

}
