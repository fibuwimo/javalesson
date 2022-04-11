import java.util.*;
public class Character{
	String name;
	int hp;
	int atk;
	int def;
	boolean isAlive=true;
	public Character(String name,int h,int a,int d){
		this.name = name;
		this.hp=h;
		this.atk=a;
		this.def=d;
	}
	public void attack(Character c){
		int damage = this.atk-c.def;
		if(damage==0){
			damage=0;
		}
		c.damage(damage);
	}
	public int getHp(){
		return this.hp;
	}
	public void setHp(int h){
		this.hp =h;
	}
	public void damage(int d){
		this.hp -=d;
		if(this.hp<=0){
			this.isAlive=false;
			this.hp=0;
		}
	}
}
