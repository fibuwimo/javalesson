import java.util.*;
public class DiceApp{
	public static void main(String[] args){
		/*
		 *サイコロ、偶奇判定
		 *4は偶数です。
		 *1は奇数です。
		 * */
		int n = new Random().nextInt(6)+1;
		if(n%2==0){
			System.out.println(n+"は偶数です。");
		}else{
			System.out.println(n+"は奇数です。");
		}
	}
}
