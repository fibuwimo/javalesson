import java.util.*;
public class ArrayTest{
	public static void main(String[] aegs){
		int [][] nums={
			{3,5},
			{4,2,1},
			{2},
		};
		int[][] scores= new int [3][2];
		scores[0][0]=2;
		//ジャグ配列
		int[][] ns = {
			{3,5},
			{3,6,8,9},
			{4,6,3}
		};
		int[][] ss = new int[3][];
		System.out.println(ss[0]);
		ss[0] = new int[]{3,5};
		System.out.println(ss[1][0]);
	}
}
