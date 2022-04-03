import java.util.*;
public class Quest{
	String[] diffi = {
		"かんたん",
		"ふつう",
		"つょい",
		"すごくつょい",
		"るなてぃっく",
	};
	ArrayList<Player> battlePlayers = new ArrayList<Player>();
	ArrayList<Enemy> battleEnemys = new ArrayList<Enemy>();
	public Quest(ArrayList<Player> players){
		while(true){
		this.playerSet(players);
		int dN = this.enemySet();
		if(dN==0){
			return;
		}
		Battle ba = new Battle(battlePlayers,battleEnemys,dN);
		}
	}
	public void playerSet(ArrayList<Player> players){
		battlePlayers.clear();
		battlePlayers.add(0,players.get(0));
		battlePlayers.add(1,players.get(1));
		battlePlayers.add(2,players.get(2));
	}
	public int enemySet(){
		System.out.println("↓-----討伐クエスト-----↓");
		for(int i =0;i<diffi.length;i++){
			System.out.printf("%d:%s%n",i+1,diffi[i]);
		}
		System.out.println("0:戻る");
		System.out.println("↑----------------------↑");
		int dN;
		do{
		System.out.printf("1~%d or 0>>",diffi.length);
			dN = new Scanner(System.in).nextInt();
		}while(dN>diffi.length || dN<0);
		battleEnemys.clear();
		switch(dN){
			case 0:
				break;
			case 1:
				Enemy e1 =new Enemy("ゲルA",10,10,0,0,8,5,3);
				Enemy e2 =new Enemy("ゲルB",10,10,0,0,8,5,3);
				Enemy e3 =new Enemy("ゲルC",10,10,0,0,8,5,3);
				battleEnemys.add(0,e1);
				battleEnemys.add(1,e2);
				battleEnemys.add(2,e3);
				break;
			case 2:
				Enemy e4 =new Enemy("バットA",15,15,0,0,9,4,14);
				Enemy e5 =new Enemy("バットB",15,15,0,0,9,4,14);
				Enemy e6 =new Enemy("バットC",15,15,0,0,9,4,14);
				battleEnemys.add(0,e4);
				battleEnemys.add(1,e5);
				battleEnemys.add(2,e6);
				break;
			case 3:
				Enemy e7 =new Enemy("ゴブ子",20,20,0,0,12,4,20);
				Enemy e8 =new Enemy("ゴブ助",25,25,0,0,10,6,10);
				Enemy e9 =new Enemy("ゴブ美",30,30,0,0,8,7,5);
				battleEnemys.add(0,e7);
				battleEnemys.add(1,e8);
				battleEnemys.add(2,e9);
				break;
			case 4:
				Enemy e10 =new Enemy("ドラゴン",99,99,0,0,15,7,50);
				battleEnemys.add(0,e10);
				break;
			case 5:
				Enemy e11 =new Enemy("かみさま",99,99,0,0,99,99,99);
				battleEnemys.add(0,e11);
				break;
		}
		return dN;
	}
}
