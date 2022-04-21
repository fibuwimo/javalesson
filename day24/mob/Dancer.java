public class Dancer extends Character{

	Dancer(String name){
		super(name);
	}
	Dancer(String name,int hp){
		super(name,hp);
	}
	public void dance(){
		System.out.println(this.name+"は情熱的に踊った");
	}
	public void attack(Matango m){
		System.out.println(this.name+"の攻撃");
		System.out.println("敵に3ポイントのダメージ");
		m.hp -= 3;
	}
}
