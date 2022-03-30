public class SuperEnemy extends Enemy{
	public SuperEnemy(){
		this.name = "ヒールスライム";
		this.hp = 30;
		this.mHp = 30;
		this.atk = 6;
		this.def = 6;
		this.sp = 0;
		this.mSp = 4;
	}
	public void action(Hero h){
		if(this.sp>=4){
			skill1();
		}else{
			attack(h);
		}
	}
	public void skill1(){
		System.out.println(this.name+"のセルフヒール！");
		System.out.println(this.name+"はHpを"+hpR(10)+"回復した");
		this.sp -=4;
	}
	public int hpR(int heal){
		if(this.hp+heal<=mHp){
			this.hp +=heal;
		}else{
			heal = this.mHp-this.hp;
			this.hp = this.mHp;
		}
		return heal;
	}
}
