public class Hero{
	String name;
	int hp = 20;
	int mHp = 20;
	int atk = 10;
	int def = 4;
	int sp = 0;
	int mSp = 3;
	boolean isAlive = true;
	public Hero(String name){
		this.name = name;
	}
	public void action(Enemy e){
		if(this.sp>=3){
			skill1(e);
		}else{
			attack(e);
		}
	}
	public void attack(Enemy e){
		e.hp -= (this.atk-e.def);
		System.out.println(this.name+"の通常攻撃！");
		System.out.println(this.name+"は"+e.name+"に"+(this.atk-e.def)+"のダメージを与えた！");
		spR();
	}
	public void skill1(Enemy e){
		e.hp -= (this.atk);
		System.out.println(this.name+"の鎧通し！ "+e.name+"の防御を貫通する！");
		System.out.println(this.name+"は"+e.name+"に"+(this.atk)+"のダメージを与えた！");
		this.sp -= 3;
	}
	public void spR(){
		if(this.sp<this.mSp){
			sp++;
		}
	}
}
