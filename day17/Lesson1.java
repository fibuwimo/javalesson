import java.util.*;
public class Lesson1{
	static void gameStart(){
		System.out.println("点数を０で初期化");
		System.out.println("startボタンを表示");
	}
	static void gameMain(){
		System.out.println("ゲームのメイン処理");
	}
	static void gameEnd(){
		System.out.println("スコアをDBに記録");
		System.out.println("retryボタンを表示");
	}
	public static void main(String[] args){
		gameStart();
		gameMain();
		gameEnd();
	}
}
