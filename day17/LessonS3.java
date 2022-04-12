import java.util.*;
public class LessonS3{
	public static void main(String[] args){
		int turnNum = new Random().nextInt(5)+1;
		int attack = new Random().nextInt(50)+1;
		System.out.println("モンスターを見つけた!!");
		System.out.printf("奇襲に成功!%dターンの間、攻撃出来る%n",turnNum);
		if(battle(turnNum,attack)){
			System.out.println("---------------------------");
			System.out.println("モンスターを倒した!!");
		}else{
			System.out.println("---------------------------");
			System.out.println("モンスターを倒しきれなかった・・・");
		}
	}
	static boolean battle(int turn,int att){
		int count = 0;
		int hp =100;
		System.out.printf("モンスターの残りHP:%d%n",hp);
		while(true){
			System.out.println("---------------------------");
			count++;
			System.out.printf("%dターン目%n",count);
			System.out.printf("%dダメージを与えた%n",att);
			hp -=att;
			if(hp<=0){
				System.out.println("攻撃終了");
				System.out.printf("モンスターの残りHP:%d%n",0);
				return true;
			}else if(count>=turn){
				System.out.println("攻撃終了");
				System.out.printf("モンスターの残りHP:%d%n",hp);
				return false;
			}
			System.out.printf("モンスターの残りHP:%d%n",hp);
		}
	}
}
