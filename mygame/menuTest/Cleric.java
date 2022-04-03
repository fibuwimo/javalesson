import java.util.*;
public class Cleric extends Player{
	public Cleric(String name,int hp,int maxHp,int sp,int maxSp,int atk,int def,int agi){
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
		ArrayList<Chara> hpOrder = new ArrayList<Chara>();
		System.out.printf("%sのヒール！%n",this.name);
		for(int i =0;i<order.size();i++){
			hpOrder.add(i,order.get(i));
		}
		for(int i =0;i<hpOrder.size()-1;i++){
			for(int j =i+1;j<hpOrder.size();j++){
				if(hpOrder.get(i).maxHp-hpOrder.get(i).hp<hpOrder.get(j).maxHp-hpOrder.get(j).hp){
					Chara temp = hpOrder.get(i);
					hpOrder.set(i,hpOrder.get(j));
					hpOrder.set(j,temp);
				}
			}
		}
		for(int i =0;i<hpOrder.size();i++){
			if(hpOrder.get(i).isAlive && hpOrder.get(i) instanceof Player){
				int damage = -this.atk;
				System.out.printf("%sのhpを%d回復した！%n",hpOrder.get(i).name,-damage);
				hpOrder.get(i).fluctHp(damage);
				return;
			}
		}
	}
}
