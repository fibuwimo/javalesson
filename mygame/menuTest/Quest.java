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
		int ans = this.enemySet();
		if(ans==0){
			return;
		}
		Battle ba = new Battle(battlePlayers,battleEnemys);
		}
	}
	public void playerSet(ArrayList<Player> players){
		battlePlayers.add(0,players.get(0));
		battlePlayers.add(1,players.get(1));
		battlePlayers.add(2,players.get(2));
	}
	public int enemySet(){
		System.out.println("↓----討伐クエスト----↓");
		for(int i =0;i<diffi.length;i++){
			System.out.printf("%d:%s%n",i+1,diffi[i]);
		}
		System.out.println("0:戻る");
		System.out.println("↑--------------------↑");
		System.out.printf("1~%d or 0>>",diffi.length);
		int dN;
		do{
			dN = new Scanner(System.in).nextInt();
		}while(dN>diffi.length || dN<0);
		switch(dN){
			case 0:
				break;
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
				Enemy e1 =new Enemy("敵A",10,10,0,5,10,5,3);
				Enemy e2 =new Enemy("敵B",10,10,0,5,8,4,8);
				Enemy e3 =new Enemy("敵C",10,10,0,5,7,4,13);
				battleEnemys.add(0,e1);
				battleEnemys.add(1,e2);
				battleEnemys.add(2,e3);
				break;
		}
		return dN;
	}
}
