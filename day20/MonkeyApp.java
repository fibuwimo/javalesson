import java.util.*;
public class MonkeyApp{
	public static void main(String[] args){
		Monkey m1 = new Monkey();
		Scanner scan = new Scanner(System.in);
		System.out.print("おさるの名前を決めてください:>");
		m1.name = scan.nextLine();
		System.out.print("おさるの歳を決めてください:>");
		m1.year = scan.nextInt();
		while(true){
			System.out.print("おさるに何をさせますか？1…挨拶、2…竹馬、3…逆立ち、4…終了>");
			int actNum = scan.nextInt();
			switch(actNum){
				case 1:
					m1.act1();
					break;
				case 2:
					m1.act2();
					break;
				case 3:
					m1.act3();
					break;
				case 4:
					System.out.print("アプリケーションを終了します。");
					return;
			}
		}
	}
}
