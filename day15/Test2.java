import java.util.*;
public class Test2{
	public static void main(String[] args){
		int[][] nums = {
			{1,2,3},
			{4,5,6},
			{7,8,9}
		};
		for(int[] arr:nums){
			for(int n:arr){
				System.out.print(n);
			}
			System.out.println();
		}
	}
}
