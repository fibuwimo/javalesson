public abstract class Character{
	String name;
	int hp;
	Character(String name){
		this(name,100);
	}
	Character(String name,int hp){
		this.name=name;
		this.hp=hp;
	}
	public void run(){
		System.out.println(this.name+"は逃げ出した！");
	}
	public abstract void attack(Matango m);
}

class Matango{
	int hp;
}
