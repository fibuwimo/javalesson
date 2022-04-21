public class MonsterApp{
	public static void main(String[] args){
		Goblin g =new Goblin(100,10);
		Werewolf ww =new Werewolf(200,20);
		DeathBat db =new DeathBat(150,30);
		g.attack();
		ww.attack();
		db.attack();
		g.run();
		ww.run();
		db.run();
	}
}
abstract class Monster{
	int hp;
	int mp;
	Monster(int hp,int mp){
		this.hp=hp;
		this.mp=mp;
	}
	public abstract void attack();
	public abstract void run();
}
abstract class WalkingMonster extends Monster{
	WalkingMonster(int hp,int mp){
		super(hp,mp);
	}
	public void run(){
		System.out.println("トコトコ走って逃げた！");
	}
}
abstract class FlyingMonster extends Monster{
	FlyingMonster(int hp,int mp){
		super(hp,mp);
	}
	public void run(){
		System.out.println("バサバサ飛んで逃げた！");
	}
}
class Goblin extends WalkingMonster{
	Goblin(int hp,int mp){
		super(hp,mp);
	}
	public void attack(){
		System.out.println("ナイフで斬りつけた！");
	}
}
class Werewolf extends WalkingMonster{
	Werewolf(int hp,int mp){
		super(hp,mp);
	}
	public void attack(){
		System.out.println("かみついた！");
	}
}
class DeathBat extends FlyingMonster{
	DeathBat(int hp,int mp){
		super(hp,mp);
	}
	public void attack(){
		System.out.println("つっついた！");
	}
}
