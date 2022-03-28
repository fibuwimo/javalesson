import java.util.*;
public class Dice{
	public static void main(String[] args){
		int dice = new Random().nextInt(6)+1;
		/*
		String ans;
		if(dice%2==0){
			ans = "偶数";
		}else{
			ans = "奇数";
		}
		*/
		System.out.printf("%dは%sです%n",dice,dice % 2 == 0 ? "偶数":"奇数");
	}
}
