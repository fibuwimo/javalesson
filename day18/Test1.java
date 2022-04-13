import java.util.*;
public class Test1{
	public static void main(String[] args){
		System.out.print("先頭の整数を入力>>");
		int from = new Scanner(System.in).nextInt();
		System.out.print("末尾の整数を入力>>");
		int to = new Scanner(System.in).nextInt();
		/*
		int n=MAth.abs(to-from)+1;
		for(int i =0;i<n;i++){
			System.out.print((from<to ? from++:from--)+" ");
		}
		System.out.println();
		*/
		while(from != to){
			System.out.print((from<to ? from++:from--)+" ");
		}
		System.out.println(to);
	}
}
