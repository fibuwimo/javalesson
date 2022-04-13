import java.util.*;
public class Lesson13{
	static int[] arrMerge(int[] arr1,int[] arr2){
		int [] arr = new int[arr1.length+arr2.length];
		for(int i=0;i<arr.length;i++){
			if(i<arr1.length){
				arr[i]=arr1[i];
			}else{
				arr[i]=arr2[i-arr1.length];
			}
		}
		return arr;
	}
	public static void main(String[] args){
		int[] arr1={1,2,3};
		int[] arr2={4,5,6,7};
		int[] arr =arrMerge(arr1,arr2);
		System.out.println(Arrays.toString(arr));
	}
}
