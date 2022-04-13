import java.util.*;
public class Lesson11{
	static void arrReverse(int[] arr){
		for(int i=0;i<arr.length/2;i++){
			int temp = arr[i];
			arr[i] = arr[arr.length-i-1];
			arr[arr.length-i-1] = temp;
		}
	}
	public static void main(String[] args){
		int[] arr = new int[]{1,2,3,4,5};
		arrReverse(arr);
		System.out.println(Arrays.toString(arr));
	}
}
