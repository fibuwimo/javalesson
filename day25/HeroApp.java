public class HeroApp{
	public static void main(String[] args){
		Sword[] swords ={
			new Sword("ひのきのぼう",15),
			new Sword("鉄の棒",50),
			new Sword("光の剣",150),
		};
		int idx =new java.util.Random().nextInt(swords.length);
		Hero h = new Hero("ああああ");
		h.attack();
		Sword sword =swords[idx];
		System.out.printf("%sは%sを拾った%n",h.name,sword.name);
		h.setSword(sword);
		h.attack();
	}
}

class Sword{
	String name;
	int damage;
	Sword(String name,int damage){
		this.name=name;
		this.damage=damage;
	}
}

class Hero{
	String name;
	int hp;
	Sword sword;
	Hero(String name){
		this(name,100);
	}
	Hero(String name,int hp){
		this.name=name;
		this.hp=hp;
	}
	void setSword(Sword sword){
		this.sword=sword;
		System.out.printf("%sは%sを装備した！%n",this.name,this.sword.name);
	}
	void attack(){
		if(this.sword == null){
			System.out.printf("%sは素手で攻撃した！5ポイントのダメージ！%n",this.name);
			return;
		}
		System.out.printf("%sは%sで攻撃した。%dポイントのダメージを与えた！",this.name,this.sword.name,this.sword.damage);
	}
}
