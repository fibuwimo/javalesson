import java.util.*;
public class Enemy extends Chara{
	public Enemy(String name,int hp,int maxHp,int sp,int maxSp,int atk,int def,int agi){
		super(name,hp,maxHp,sp,maxSp,atk,def,agi);
	}
	public void act(ArrayList<Chara> order){
		int n;
		do{
			n = new Random().nextInt(order.size());
		}while(order.get(n) instanceof Enemy|| order.get(n).isAlive==false);
		this.normalAttack(order.get(n));
	}
	public void normalAttack(Chara c){
		System.out.printf("%sの通常攻撃！%n",this.name);
		int damage = this.atk-c.def;
		if(damage<0){
			damage=0;
		}
		System.out.printf("%sに%dのダメージ！%n",c.name,damage);
		c.fluctHp(damage);
	}
}
