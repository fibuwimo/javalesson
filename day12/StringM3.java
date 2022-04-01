import java.util.*;
public class StringM3{
	public static void main(String[] args){
		System.out.print("整数をカンマ区切りで入力>>");
		String numsC = new Scanner(System.in).nextLine();
		String[] nums = numsC.split(",");
		int sum=0;
		for(int i=0;i<nums.length;i++){
			int num = Integer.parseInt(nums[i]);
			sum +=num;
		}
		System.out.println(sum);
	}
}
