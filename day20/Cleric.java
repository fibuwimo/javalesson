import java.util.*;
public class Cleric{
	String name;
	final int MAX_HP=50;
	int hp = MAX_HP;
	final int MAX_MP=10;
	int mp = MAX_MP;

	public void selfAid(){
		if(this.mp<5){
			System.out.println("MPが足りない！");
			return;
		}
			System.out.println(this.name+"は、セルフエイドを唱えた！");
		this.mp -=5;
		this.hp = MAX_HP;
			System.out.println("HPが最大まで回復しました！");
	}
	public int pray(int sec){
			System.out.println(this.name+"は、"+sec+"秒間天に祈った");
		int rnd = new Random().nextInt(3);
		int recover = sec + rnd;
		recover = Math.min(recover,MAX_MP-this.mp);
		this.mp += recover;
		return recover;
	}
}
