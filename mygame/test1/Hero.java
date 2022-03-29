public class Hero{
	String name;
	int hp = 20;
	int atk = 10;
	int def = 4;
	int sp = 0;
	public Hero(String name){
		this.name = name;
	}
	public void attack(Enemy e){
		if(this.sp<3){
			e.hp -= (this.atk-e.def);
			System.out.println(this.name+"の通常攻撃！");
			System.out.println(this.name+"は"+e.name+"に"+(this.atk-e.def)+"のダメージを与えた！");
			this.sp++;
		}else{
			e.hp -= (this.atk);
			System.out.println(this.name+"の鎧通し！ "+e.name+"の防御を貫通する！");
			System.out.println(this.name+"は"+e.name+"に"+(this.atk)+"のダメージを与えた！");
			this.sp -= 3;
		}
	}
}
