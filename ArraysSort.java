
import java.util.Arrays;

public class ArraysSort {

	public static void main(String[] args) {
	
		int[] arr1 = {1,10,3,4,5,7,8,2,9};
		
		Arrays.sort(arr1);
		System.out.println(Arrays.toString(arr1));
		int[] arr2 = arr1;
		for (int i=1; i>=arr2.length; i-- ) {
			System.out.println(i);
		}
		

	}

}