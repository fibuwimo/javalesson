public class Enemy{
	String name = "スライム";
	int hp = 40;
	int atk = 7;
	int def = 6;
	int sp = 0;
	public void attack(Hero h){
		h.hp -= (this.atk-h.def);
		System.out.println(this.name+"の通常攻撃！");
		System.out.println(this.name+"は"+h.name+"に"+(this.atk-h.def)+"のダメージを与えた！");
	}
}
