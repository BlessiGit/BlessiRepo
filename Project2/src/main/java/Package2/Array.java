package Package2;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		int[] arr = {10, 45, 78, 34, 23};
		Arrays.sort(arr);
		System.out.println( "The second largest number is " +arr[arr.length-2]);
		
	}

}
