import java.util.*;
public class WhileLesson{
	public static void main(String[] args){
		/*
			 int n = 5;
			 while(n > 0){
			 System.out.println(n);
			 n--;
			 }
			 System.out.println("発射！");
			 */
		/*int count=0;
		int n = 0;
		while(n != 7){
			count++;
			n = new Random().nextInt(10);
			System.out.println(n);
		}
		System.out.println(count + "回目に7が出ました");
		/*
		 *SSR 1
		 *bSR 3
		 *r 23
		 *n 73
		*/
		int count =0;
		while(true){
			count++;
			int rnd = new Random().nextInt(100);
			if(rnd<1){
			System.out.println("SSR!!");
			break;
			}else if(rnd<4){
			System.out.println("SR!");
			}else if(rnd<27){
			System.out.println("R");
			}else{
			System.out.println("n");
			}
		}
			System.out.println(count+"回目にSSRが出ました");
	}
}
