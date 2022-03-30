import java.util.*;
public class ArrLesson5{
	public static void main(String[] args){
		int[] nums = new int[10];
		for(int i=0;i<nums.length;i++){
			nums[i] = new Random().nextInt(6)+1;
		}
		System.out.println(Arrays.toString(nums));
	}
}
