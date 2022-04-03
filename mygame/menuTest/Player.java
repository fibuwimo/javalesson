import java.util.*;
public class Player extends Chara{
	static int money;
	static int coin;
	int exp =0;
	int maxExp=100;
	int lv =1;
	public Player(String name,int hp,int maxHp,int sp,int maxSp,int atk,int def,int agi){
		super(name,hp,maxHp,sp,maxSp,atk,def,agi);
		Player.money +=100;
	}
	public void act(ArrayList<Chara> order){
		this.normalAttack(order);
	}
	public void normalAttack(ArrayList<Chara> order){
		int n;
		do{
			n = new Random().nextInt(order.size());
		}while(order.get(n) instanceof Player || order.get(n).isAlive==false);
		System.out.printf("%sの通常攻撃！%n",this.name);
		int damage = this.atk-order.get(n).def;
		if(damage<0){
			damage=0;
		}
		System.out.printf("%sに%dのダメージ！%n",order.get(n).name,damage);
		order.get(n).fluctHp(damage);
		if(this.sp<this.maxSp){
		this.sp += 1;
		}
	}
	public void statusIndi(){
		System.out.println("↓------ステータス------↓");
		System.out.printf("%s     :%s%n","名前",this.name);
		System.out.printf("%s:%d,%s:%d/%d%n","Lv",this.lv,"exp",this.exp,this.maxExp);
		System.out.printf("%s/%s:%d/%d%n","hp","最大Hp",this.hp,this.maxHp);
		System.out.printf("%s/%s:%d/%d%n","sp","最大Sp",this.sp,this.maxSp);
		System.out.printf("%s   :%d%n","攻撃力",this.atk);
		System.out.printf("%s   :%d%n","防御力",this.def);
		System.out.printf("%s     :%d%n","敏速",this.agi);
		System.out.println("↑----------------------↑");
		System.out.print("エンターで戻る>>");
		new Scanner(System.in).nextLine();
	}
	public int getExp(){
		return this.exp;
	}
	public void fluctExp(int exp){
		this.exp += exp;
		while(this.exp>=this.maxExp){
			this.exp -=this.maxExp;
			this.fluctMaxExp(100);
			this.fluctLv(1);
		}
	}
	public int getMaxExp(){
		return this.maxExp;
	}
	public void fluctMaxExp(int maxExp){
		this.maxExp += maxExp;
	}
	public int getLv(){
		return this.lv;
	}
	public void fluctLv(int lv){
		this.lv += lv;
		this.maxHp +=2;
		this.atk +=1;
		this.def +=1;
		this.agi +=1;
		System.out.printf("%Sのレベルが上がった！%n",this.name);
		System.out.printf("最大hp+%d,攻撃力+%d,防御力+%d,敏速+%d%n",2,1,1,1);
	}
}
