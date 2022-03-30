public class Enemy{
	String name;
	int hp;
	int mHp;
	int atk;
	int def;
	int sp;
	int mSp;
	public Enemy(){
		this.name = "スライム";
		this.hp = 25;
		this.mHp = 25;
		this.atk = 6;
		this.def = 5;
		this.sp = 0;
		this.mSp = 0;
	}
	public void action(Hero h){
		attack(h);
	}
	public void attack(Hero h){
		h.hp -= (this.atk-h.def);
		spR();
		System.out.println(this.name+"の通常攻撃！");
		System.out.println(this.name+"は"+h.name+"に"+(this.atk-h.def)+"のダメージを与えた！");
	}
	public void spR(){
		if(sp<mSp){
			sp++;
		}
	}
}
