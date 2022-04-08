import java.util.*;
public class Test{
	public static void main(String[] args){
		int [] data = new int[]{2,3,4,};
		int total =sumOf(data);
		System.out.println(Arrays.toString(data));
		System.out.println("合計は:"+total);
		total= sumOf(new int[]{10,20,30});
		System.out.println("合計は:"+total);
		System.out.println("最大は:"+maxOf(3,8,5));
		hello();
		hello("秋田");
		arrayTwice(data);
		System.out.println(Arrays.toString(data));
		int[] arr2 ={1,2,3,4,5};
		System.out.println(Arrays.toString(arr2));
		arrShuffle(arr2);
		System.out.println(Arrays.toString(arr2));
	}
	public static int sumOf(int[] arr){
		int sum=0;
		for(int n:arr){
			sum +=n;
		}
		return sum;
	}
	public static int maxOf(int a,int b,int c){
		return Math.max(a,Math.max(b,c));
	}
	public static void hello(){
		System.out.println("hello");
	}
	public static void hello(String name){
		hello();
		System.out.println(name);
	}
	public static void arrayTwice(int[] arr){
		for(int i=0;i<arr.length;i++){
			arr[i]=arr[i]*2;
		}
	}
	public static void arrShuffle(int[] arr){
		for(int i=0;i<arr.length-1;i++){
			int idx =new Random().nextInt(arr.length-i)+i;
			int temp = arr[idx];
			arr[idx] = arr[i];
			arr[i] = temp;
		}
	}
}
