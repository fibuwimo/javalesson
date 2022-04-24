import java.util.*;
public class Hero extends Character{
	String[] acts={
		"こうげき",
		"まほう",
	};
	String[] magics={
		"フレイムボルト",
		"ヒール",
		"エターナルフォースブリザード",
		"戻る",
	};
	int[] magicGages={3,2,9};
	int magicNum =0;
	int magicGage=0;
	Hero(String name,int hp,int atk,int agi){
		super(name,hp,atk,agi);
	}
	boolean actGage(){
		if(this.magicNum!=0){
			this.count ++;
			System.out.print(this.name+"HP:"+this.hp+",spell:");
			for(int i=0;i<magicGage;i++){
				System.out.print(i<this.count?"★":"☆");
			}
			System.out.println();
			if(this.count>=magicGage){
				this.count=0;
				return true;
			}else{
				return false;
			}
		}
		this.count +=this.agi;
		System.out.print(this.name+"HP:"+this.hp+",act:");
		for(int i=0;i<GAGE;i++){
			System.out.print(i<this.count?"◆":"◇");
		}
		System.out.println();
		if(this.count>=GAGE){
			this.count=0;
			return true;
		}else{
			return false;
		}
	}
	void act(Character c){
		if(this.magicNum!=0){
			switch(this.magicNum){
				case 1:
					this.fire(c);
					break;
				case 2:
					this.heal(c);
					break;
				case 3:
					this.efb(c);
					break;
			}
			this.magicNum=0;
			return;
		}
		for(int i=0;i<acts.length;i++){
			System.out.printf("%d:%s%n",i,acts[i]);
		}
		int idx;
		do{
			System.out.printf("0~%d>>",acts.length-1);
			idx = new Scanner(System.in).nextInt();
		}while(idx<0 || idx>acts.length-1);
		switch(idx){
			case 0:
				super.attack(c);
				break;
			case 1:
				this.magic(c);
				break;
		}
	}
	void magic(Character c){
		for(int i=0;i<magics.length;i++){
			System.out.printf("%d:%s%n",i,magics[i]);
		}
		int idx;
		do{
			System.out.printf("0~%d>>",magics.length-1);
			idx = new Scanner(System.in).nextInt();
		}while(idx<0 || idx>=magics.length);
		if(idx==magics.length-1){
			this.act(c);
			return;
		}
		System.out.printf("%sは%sの詠唱を開始した%n",this.name,this.magics[idx]);
		this.magicNum=idx+1;
		this.magicGage=this.magicGages[idx];
	}
	void fire(Character c){
		System.out.printf("%sの%s！%sに%dのダメージを与えた！%n",this.name,this.magics[0],c.name,this.atk*3);
		c.setHp(c.getHp()-this.atk*3);
	}
	void heal(Character c){
		System.out.printf("%sの%s！%sのＨＰを%d回復した！%n",this.name,this.magics[1],this.name,15);
		this.setHp(this.getHp()+15);
	}
	void efb(Character c){
		System.out.printf("%sの%s！%sに%dのダメージを与えた！%n",this.name,this.magics[2],c.name,this.atk*99);
		c.setHp(c.getHp()-this.atk*99);
	}
}
