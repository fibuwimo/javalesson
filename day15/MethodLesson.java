import java.util.*;
public class MethodLesson{
	public static void main(String[] args){
		int [][] arr= new int[3][3];
		Random rnd = new Random();
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				arr[i][j]=rnd.nextInt(3)+1;
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
		int count=0;
		for(int i =0;i<arr.length;i++){
			if(isSame(arr[i])){
				count++;
			}
		}
		System.out.println(count>0?count+" line Win!!":"Lose...");
	}
	public static boolean isSame(int[] arr){
		int first=arr[0];
		for(int i=1;i<arr.length;i++){
			if(first !=arr[i]){
				return false;
			}
		}
		return true;
	}
}
