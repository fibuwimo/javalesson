import java.util.*;
public class Numeron{
	public static void main(String[] args){
		int x = new Random().nextInt(9)+1;
		int y;
		int z;
		int n;
		do{
			y = new Random().nextInt(10);
		}while(y==x);
		do{
			z = new Random().nextInt(10);
		}while(z==x || z==y);
		System.out.println("【ヒット＆ブロウ!】 各位の数字が違う３桁の自然数を当てろ！！");
		System.out.println("ヒット:数字も位置も正しい。ブロウ:数字は正しいが位置が誤り。");
			//System.out.println(x+" "+y+" "+z);//確認用
		for(int i =1,hit=0; hit!=3;i++){
			int blow = 0;
			hit=0;
			System.out.println("3桁の数字>>");
			n= new Scanner(System.in).nextInt();
			int a = n/100;
			int b = (n%100)/10;
			int c = ((n%100)%10);
			//System.out.println(a+" "+b+" "+c);//確認用
			if(a==x){
				hit++;
			}else if(a==y){
				blow++;
			}else if(a==z){
				blow++;
			}
			if(b==x){
				blow++;
			}else if(b==y){
				hit++;
			}else if(b==z){
				blow++;
			}
			if(c==x){
				blow++;
			}else if(c==y){
				blow++;
			}else if(c==z){
				hit++;
			}
			System.out.println(hit+"ヒット、"+blow+"ブロウです");//確認用
			if(hit==3){
			System.out.println(hit+"ヒット！正解！　答えは"+n+"で、挑戦回数は"+i+"回です。");
			}else{
			}
		}
	}
}
