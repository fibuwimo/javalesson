public class Wizard extends Character{

	Wizard(String name){
		super(name);
	}
	Wizard(String name,int hp){
		super(name,hp);
	}
	public void indig(Matango m){
		System.out.println(this.name+"のインディグネイション！");
		System.out.println("敵に10ポイントのダメージ");
		m.hp -= 10;
	}
	@Override
	public void attack(Matango m){
		System.out.println(this.name+"の攻撃");
		System.out.println("敵に3ポイントのダメージ");
		m.hp -= 4;
	}
}
