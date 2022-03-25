import java.util.*;
public class ParaRpg{
	public static void main(String[] args){
		int hp;
		int attack;
		int bougyo;
		int fortune;
		while(true){
			hp = new Random().nextInt(8)+12;
			attack = new Random().nextInt(5)+7;
			bougyo = new Random().nextInt(5)+7;
			fortune = new Random().nextInt(4);
			System.out.println();
			System.out.println("◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆");
			System.out.println("HP:"+hp);
			System.out.println("攻撃力:"+attack);
			System.out.println("防御力:"+bougyo);
			System.out.println("ボーナス:"+fortune);
			System.out.println("◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆");
			System.out.print("これでok?(y or n)>>");
			String ans = new Scanner(System.in).next();
			if(ans.equals("y")){
				break;
			}
		}
		while(fortune != 0){
			System.out.println();
			System.out.println("◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆");
			System.out.println("HP:"+hp);
			System.out.println("攻撃力:"+attack);
			System.out.println("防御力:"+bougyo);
			System.out.println("ボーナス:"+fortune);
			System.out.println("◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆");
			System.out.print("ボーナスポイントを振り分けます(ＨＰ:h、攻撃:a、防御:b)>>");
			String bo = new Scanner(System.in).next();
			switch(bo){
				case "h":
					hp++;
					fortune--;
					break;
				case "a":
					attack++;
					fortune--;
					break;
				case "b":
					bougyo++;
					fortune--;
					break;
			}
			if(fortune==0){
				break;
			}
		}
		System.out.println();
		System.out.println("◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆");
		System.out.println("HP:"+hp);
		System.out.println("攻撃力:"+attack);
		System.out.println("防御力:"+bougyo);
		System.out.println("◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆");
	}
}
