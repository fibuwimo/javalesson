import java.util.*;
public class ParaRpg{
	public static void main(String[] args){
		int h;
		int a;
		int b;
		int f;
		while(true){
			h = new Random().nextInt(10)+10;
			a = new Random().nextInt(7)+5;
			b = new Random().nextInt(7)+5;
			f = new Random().nextInt(4);
			System.out.println("◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆");
			System.out.println("HP:"+h);
			System.out.println("攻撃力:"+a);
			System.out.println("防御力:"+b);
			System.out.println("ボーナス:"+f);
			System.out.println("◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆");
			System.out.print("これでok?(y or n)>>");
			String ans = new Scanner(System.in).next();
			if(ans.equals("y")){
				break;
			}
		}
		while(true){
			System.out.println("◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆");
			System.out.println("HP:"+h);
			System.out.println("攻撃力:"+a);
			System.out.println("防御力:"+b);
			System.out.println("ボーナス:"+f);
			System.out.println("◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆");
			System.out.print("ボーナスポイントを振り分けます(ＨＰ:h、攻撃:a、防御:b)>>");
			String bo = new Scanner(System.in).next();
			switch(bo){
				case "h":
					h++;
					f--;
					break;
				case "a":
					a++;
					f--;
					break;
				case "b":
					b++;
					f--;
					break;
			}
			if(f==0){
				break;
			}
		}
			System.out.println("◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆");
			System.out.println("HP:"+h);
			System.out.println("攻撃力:"+a);
			System.out.println("防御力:"+b);
			System.out.println("◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆");
	}
}
