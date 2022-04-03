import java.util.*;
public class Wizard extends Player{
	public Wizard(String name,int hp,int maxHp,int sp,int maxSp,int atk,int def,int agi){
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
		ArrayList<Chara> defOrder = new ArrayList<Chara>();
		System.out.printf("%sのファイアーボール！%n",this.name);
		for(int i =0;i<order.size();i++){
			defOrder.add(i,order.get(i));
		}
		for(int i =0;i<defOrder.size()-1;i++){
			for(int j =i+1;j<defOrder.size();j++){
				if(defOrder.get(i).def<defOrder.get(j).def){
					Chara temp = defOrder.get(i);
					defOrder.set(i,defOrder.get(j));
					defOrder.set(j,temp);
				}
			}
		}
		for(int i =0;i<defOrder.size();i++){
			if(defOrder.get(i).isAlive && defOrder.get(i) instanceof Enemy){
				int damage = this.atk;
				if(damage<0){
					damage=0;
				}
				System.out.printf("%sに%dのダメージ！%n",defOrder.get(i).name,damage);
				defOrder.get(i).fluctHp(damage);
				return;
			}
		}
	}
}
