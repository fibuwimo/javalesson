import java.util.*;
public class Odai3{
	public static void main(String[] args){
		String [] menus = {"パーティー","アイテム","クエスト"};
		String [] heros = {"リバァイ","ゆうた","†クラウド†","わし(53)"};
		String [] items = {"やくそう","どくけし","らすとえりくさー","しろいこな","メガトンコイン"};
		String [] quests = {"迷子の猫を探して！","隣町までお使い","ちょっと魔王倒してこい","わがまま王女のお願い","古の秘宝"};
		bullet(menus);
		int selectNum = selectNum(menus.length);
		switch(selectNum){
			case 1:
				bullet(heros);
				break;
			case 2:
				bullet(items);
				break;
			case 3:
				bullet(quests);
				break;
		}
	}
	public static void bullet(String[] arr){
		System.out.println("-------------------------------");
		for(int i=0;i<arr.length;i++){
			System.out.printf("%d:%S%n",i+1,arr[i]);
		}
		System.out.println("-------------------------------");
	}
	public static int selectNum(int n){
		System.out.printf("1~%dの整数を入力>>",n);
		return new Scanner(System.in).nextInt();
	}
}
