import java.util.*;
public class Swap{
	public static void main(String[] args){
		int a =10;
		int b =20;
		/*
		 *処理
		 *二値の交換アルゴリズム
		 **/
		int tem = a;
		a=b;
		b=tem;
		//"a:20,b:10"
		System.out.println("a:"+a+",b:"+b);

		int[] data={3,1,5,2,4};
		//処理
		for(int i =0;i<data.length/2;i++){
			int temp = data[i];
			data[i] = data[data.length-1-i];
			data[data.length-1-i] = temp;
		}
		System.out.println(Arrays.toString(data));
	}
}
