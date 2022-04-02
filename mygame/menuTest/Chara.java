import java.util.*;
public class Chara{
	String name ;
	int hp;
	int maxHp;
	int sp;
	int maxSp;
	int atk;
	int def;
	int agi;
	boolean isAlive =true;
	public Chara(String name,int hp,int maxHp,int sp,int maxSp,int atk,int def,int agi){
		setName(name);
		setHp(hp);
		setMaxHp(maxHp);
		setSp(sp);
		setMaxSp(maxSp);
		setAtk(atk);
		setDef(def);
		setAgi(agi);
	}
	public String getName(){
		return this.name;
	}
	public int getHp(){
		return this.hp;
	}
	public int getMaxHp(){
		return this.maxHp;
	}
	public int getSp(){
		return this.sp;
	}
	public int getMaxSp(){
		return this.maxSp;
	}
	public int getAtk(){
		return this.atk;
	}
	public int getDef(){
		return this.def;
	}
	public int getAgi(){
		return this.agi;
	}
	public void setName(String name){
		this.name = name;
	}
	public void setHp(int hp){
		this.hp =  hp;
	}
	public void setMaxHp(int maxHp){
		this.maxHp =  maxHp;
	}
	public void setSp(int sp){
		this.sp =  sp;
	}
	public void setMaxSp(int maxSp){
		this.maxSp =  maxSp;
	}
	public void setAtk(int atk){
		this.atk =  atk;
	}
	public void setDef(int def){
		this.def =  def;
	}
	public void setAgi(int agi){
		this.agi =  agi;
	}
	public void fluctHp(int damage){
		if(damage<0){
			damage=0;
		}
		this.hp -= damage;
		if(this.hp<=0){
			this.hp=0;
			this.isAlive = false;
			System.out.printf("%sは倒れた%n",this.name);
		}
		if(this.hp>this.maxHp){
			this.hp=this.maxHp;
		}
	}
	public void statusIndi(){
		System.out.println("----ステータス----");
		System.out.printf("%s     :%s%n","名前",this.name);
		System.out.printf("%s/%s:%d/%d%n","hp","最大Hp",this.hp,this.maxHp);
		System.out.printf("%s/%s:%d/%d%n","sp","最大Sp",this.sp,this.maxSp);
		System.out.printf("%s   :%d%n","攻撃力",this.atk);
		System.out.printf("%s   :%d%n","防御力",this.def);
		System.out.printf("%s     :%d%n","敏速",this.agi);
		System.out.print("エンターで戻る>>");
		new Scanner(System.in).nextLine();
	}
	public void act(ArrayList<Chara> order){
	}
}
