import java.util.*;
public class Hero extends Player{
	public Hero(String name,int hp,int maxHp,int sp,int maxSp,int atk,int def,int agi){
		super(name,hp,maxHp,sp,maxSp,atk,def,agi);
	}
	public void act(ArrayList<Chara> order){
		if(this.sp==this.maxSp){
			this.skill1(order);
		}else{
		normalAttack(order);
		}
	}
	public void skill1(ArrayList<Chara> order){
		this.sp = 0;
		System.out.printf("%sのワイドスラッシュ！%n",this.name);
		for(int i =0;i<order.size();i++){
			if(order.get(i).isAlive && order.get(i) instanceof Enemy){
		int damage = this.atk-1-order.get(i).def;
		if(damage<0){
			damage=0;
		}
		System.out.printf("%sに%dのダメージ！%n",order.get(i).name,damage);
		order.get(i).fluctHp(damage);
			}
		}
	}
}
