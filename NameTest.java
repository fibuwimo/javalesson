import java.util.*;
public class NameTest{
	public static void main(String[] args){
		String name1 = "";
		int a = 1;
		do{
			System.out.print("あなたの名前(２文字以上)を入力してください>>");
			name1 = new Scanner(System.in).nextLine();
			a = name1.length();
		}while(a < 2);
		String c ="";
		for(int b=a;b>0;b=b-1) {
			c = c+name1.charAt(b-1);
		}
		String s0 ="…………………………………………………";
		for(int i=0;i<s0.length(); i++){
			System.out.print(s0.charAt(i));
			try{
				Thread.sleep(100);
			}
			catch(InterruptedException e){
			}
		}
		System.out.println("");
		String s1 ="マイマイ「おはようございます "+ c +" さん、昨晩はお楽しみでしたね」";
		for(int i=0;i<s1.length(); i++){
			System.out.print(s1.charAt(i));
			try{
				Thread.sleep(100);
			}
			catch(InterruptedException e){
			}
		}
		try{
			Thread.sleep(1000);
		}
		catch(InterruptedException e){
		}
		System.out.println("");
		String s2 =name1+"「僕の名前を天地無用にするな！あと、昨晩はいつになくグッスリ安眠だ！」";
		for(int i=0;i<s2.length(); i++){
			System.out.print(s2.charAt(i));
			try{
				Thread.sleep(100);
			}
			catch(InterruptedException e){
			}
		}
		try{
			Thread.sleep(1000);
		}
		catch(InterruptedException e){
		}
		System.out.println("");
		String s3 ="マイマイ「失礼、噛みました」";
		for(int i=0;i<s3.length(); i++){
			System.out.print(s3.charAt(i));
			try{
				Thread.sleep(100);
			}
			catch(InterruptedException e){
			}
		}
		try{
			Thread.sleep(1000);
		}
		catch(InterruptedException e){
		}
		System.out.println("");
		String s4 =name1+"「わざとだ」";
		for(int i=0;i<s4.length(); i++){
			System.out.print(s4.charAt(i));
			try{
				Thread.sleep(100);
			}
			catch(InterruptedException e){
			}
		}
		try{
			Thread.sleep(1000);
		}
		catch(InterruptedException e){
		}
		System.out.println("");
		String s5 ="マイマイ「かみまみた！」";
		for(int i=0;i<s5.length(); i++){
			System.out.print(s5.charAt(i));
			try{
				Thread.sleep(100);
			}
			catch(InterruptedException e){
			}
		}
		try{
			Thread.sleep(1000);
		}
		catch(InterruptedException e){
		}
		System.out.println("");
		String s6 =name1+"「わざとじゃない！？」";
		for(int i=0;i<s6.length(); i++){
			System.out.print(s6.charAt(i));
			try{
				Thread.sleep(100);
			}
			catch(InterruptedException e){
			}
		}
		try{
			Thread.sleep(1000);
		}
		catch(InterruptedException e){
		}
		System.out.println("");
		String s7 ="マイマイ「そんなことより"+name1+"さん、今日の運勢を占ってあげましょう」";
		for(int i=0;i<s7.length(); i++){
			System.out.print(s7.charAt(i));
			try{
				Thread.sleep(100);
			}
			catch(InterruptedException e){
			}
		}
		try{
			Thread.sleep(1000);
		}
		catch(InterruptedException e){
		}
		System.out.println("");
		String s8 =name1+"「藪から棒にどうした」";
		for(int i=0;i<s8.length(); i++){
			System.out.print(s8.charAt(i));
			try{
				Thread.sleep(100);
			}
			catch(InterruptedException e){
			}
		}
		try{
			Thread.sleep(1000);
		}
		catch(InterruptedException e){
		}
		System.out.println("");
		String s9 ="マイマイ「まずは"+name1+"さんの好きな自然数を教えてください」";
		for(int i=0;i<s9.length(); i++){
			System.out.print(s9.charAt(i));
			try{
				Thread.sleep(100);
			}
			catch(InterruptedException e){
			}
		}
		try{
			Thread.sleep(1000);
		}
		catch(InterruptedException e){
		}
		System.out.println("");
		String s10 =name1+"「自然数か……>>」";
		for(int i=0;i<s10.length(); i++){
			System.out.print(s10.charAt(i));
			try{
				Thread.sleep(100);
			}
			catch(InterruptedException e){
			}
		}
		String num = new Scanner(System.in).nextLine();
		boolean result1 = true;
		for(int i =0;i<num.length();i++){
			if(Character.isDigit(num.charAt(i))){
				continue;
			}else{
				result1=false;
			}
		}
		while(result1 == false){
			try{
				Thread.sleep(1000);
				}
				catch(InterruptedException e){
				}
			System.out.println("");
			String s2 =name1+"「僕の名前をトマトや新聞紙みたいに呼ぶんじゃない！あと、昨晩はいつになくグッスリ安眠だ！」";
			for(int i=0;i<s2.length(); i++){
				System.out.print(s2.charAt(i));
				try{
				Thread.sleep(100);
				}
				catch(InterruptedException e){
				}
=======
			}
			catch(InterruptedException e){
			}
			String s11 ="マイマイ「………"+name1+"さん、自然数の何たるかも分からないんですか？」";
			for(int i=0;i<s11.length(); i++){
				System.out.print(s11.charAt(i));
				try{
					Thread.sleep(100);
				}
				catch(InterruptedException e){
				}
			}
			try{
				Thread.sleep(1000);
			}
			catch(InterruptedException e){
			}
			System.out.println("");
			String s12 =name1+"「自然数か……>>」";
			for(int i=0;i<s12.length(); i++){
				System.out.print(s12.charAt(i));
				try{
					Thread.sleep(100);
				}
				catch(InterruptedException e){
				}
			}
			String num2 = new Scanner(System.in).nextLine();
			num = num2;
			result1 = true;
			for(int i =0;i<num.length();i++){
				if(Character.isDigit(num.charAt(i))){
					continue;
				}else{
					result1=false;
				}
			}
		}
		int n = Integer.parseInt(num);
		int p = name1.charAt(1);
		try{
			Thread.sleep(800);
		}
		catch(InterruptedException e){
		}
		String s13 ="マイマイ「"+n+"ですか……"+name1+"さんらしい平々凡々な数字ですね」";
		for(int i=0;i<s13.length(); i++){
			System.out.print(s13.charAt(i));
			try{
				Thread.sleep(100);
			}
			catch(InterruptedException e){
			}
		}
		try{
			Thread.sleep(1000);
		}
		catch(InterruptedException e){
		}
		System.out.println("");
		String s14 =name1+"「過去に戻って小数でも入力してやろうか」";
		for(int i=0;i<s14.length(); i++){
			System.out.print(s14.charAt(i));
			try{
				Thread.sleep(100);
			}
			catch(InterruptedException e){
			}
		}
		try{
			Thread.sleep(1000);
		}
		catch(InterruptedException e){
		}
		System.out.println("");
		String s15 ="マイマイ「メタいですよ……コホン、さて、"+name1+"さんの運勢は………………」";
		for(int i=0;i<s15.length(); i++){
			System.out.print(s15.charAt(i));
			try{
				Thread.sleep(100);
			}
			catch(InterruptedException e){
			}
		}
		try{
			Thread.sleep(1000);
		}
		catch(InterruptedException e){
		}
		System.out.println("");
		String s16 =name1+"「……………………」";
		for(int i=0;i<s16.length(); i++){
			System.out.print(s16.charAt(i));
			try{
				Thread.sleep(100);
			}
			catch(InterruptedException e){
			}
		}
		try{
			Thread.sleep(1000);
		}
		catch(InterruptedException e){
		}			
		int fortune = (n+p)%3;
		switch(fortune){
			case 0:
				System.out.println("");
				String s17 ="マイマイ「ﾁｯ……大吉ですねーよかったですねーはいはい」";
				for(int i=0;i<s17.length(); i++){
					System.out.print(s17.charAt(i));
					try{
						Thread.sleep(100);
					}
					catch(InterruptedException e){
					}
				}
				try{
					Thread.sleep(1000);
				}
				catch(InterruptedException e){
				}
				System.out.println("");
				String s18 =name1+"「嘘でもいいから喜んで？！」";
				for(int i=0;i<s18.length(); i++){
					System.out.print(s18.charAt(i));
					try{
						Thread.sleep(100);
					}
					catch(InterruptedException e){
					}
				}
				try{
					Thread.sleep(1000);
				}
				catch(InterruptedException e){
				}			
				break;
			case 1:
				System.out.println("");
				String s19 ="マイマイ「吉です、やはり"+name1+"さんらしい平々凡々な結果ですね」";
				for(int i=0;i<s19.length(); i++){
					System.out.print(s19.charAt(i));
					try{
						Thread.sleep(100);
					}
					catch(InterruptedException e){
					}
				}
				try{
					Thread.sleep(1000);
				}
				catch(InterruptedException e){
				}
				System.out.println("");
				String s20 =name1+"「色々と平らなお前にだけは言われたくないな」";
				for(int i=0;i<s20.length(); i++){
					System.out.print(s20.charAt(i));
					try{
						Thread.sleep(100);
					}
					catch(InterruptedException e){
					}
				}
				try{
					Thread.sleep(1000);
				}
				catch(InterruptedException e){
				}			
				break;
			case 2:
				System.out.println("");
				String s21 ="マイマイ「出ました！大凶ですよ大凶！！」";
				for(int i=0;i<s21.length(); i++){
					System.out.print(s21.charAt(i));
					try{
						Thread.sleep(100);
					}
					catch(InterruptedException e){
					}
				}
				try{
					Thread.sleep(1000);
				}
				catch(InterruptedException e){
				}
				System.out.println("");
				String s22 =name1+"「他人の不幸で喜ぶなんて、お兄ちゃんは悲しいぞ！」";
				for(int i=0;i<s22.length(); i++){
					System.out.print(s22.charAt(i));
					try{
						Thread.sleep(100);
					}
					catch(InterruptedException e){
					}
				}
				try{
					Thread.sleep(1000);
				}
				catch(InterruptedException e){
				}			
				break;
		}
		System.out.println("");
		String s23 ="　　　　　　　　　　　　　　　　　　　　　　　　　　To Be Continued";
		for(int i=0;i<s23.length(); i++){
			System.out.print(s23.charAt(i));
			try{
				Thread.sleep(50);
			}
			catch(InterruptedException e){
			}
		}
	}
	public static void talk(String talkText){

			System.out.println("");
			String s1 =talkText;
			for(int i=0;i<s1.length(); i++){
				System.out.print(s1.charAt(i));
				try{
				Thread.sleep(100);
				}
				catch(InterruptedException e){
				}
			}
				try{
				Thread.sleep(1000);
				}
				catch(InterruptedException e){
				}
	}
}	
