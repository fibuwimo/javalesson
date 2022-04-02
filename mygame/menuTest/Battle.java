import java.util.*;
public class Battle{
	ArrayList<Chara> order = new ArrayList<Chara>();
	boolean isAliveP = true;
	boolean isAliveE = true;
	public Battle(ArrayList<Player> battlePlayers,ArrayList<Enemy> battleEnemys){
		System.out.println("------バトル開始!------");
		int turnCount =1;
		while(true){
			if(!isAliveP){
				System.out.println("敗北者じゃけぇ……");
				return;
			}else if(!isAliveE){
				System.out.println("勝利！");
				return;
			}
			isAliveP = false;
			isAliveE = false;
			this.decideOrder(battlePlayers,battleEnemys);
			this.turn(battlePlayers,battleEnemys,turnCount);
			turnCount++;
		}

		/*while(true){
			battlePlayers.get(0).normalAttack(battleEnemys.get(0));
			if((battleEnemys.get(0).isAlive)==false){
			System.out.printf("%sは倒れた%n",battleEnemys.get(0).name);
			break;
			}
			System.out.printf("%sのhp:%d,%sのhp:%d%n",battlePlayers.get(0).name,battlePlayers.get(0).hp,battleEnemys.get(0).name,battleEnemys.get(0).hp);
			battleEnemys.get(0).normalAttack(battlePlayers.get(0));
			if((battlePlayers.get(0).isAlive)==false){
			System.out.printf("%sは倒れた%n",battlePlayers.get(0).name);
			break;
			}
			System.out.printf("%sのhp:%d,%sのhp:%d%n",battleEnemys.get(0).name,battleEnemys.get(0).hp,battlePlayers.get(0).name,battlePlayers.get(0).hp);
			}*/
	}
	public void decideOrder(ArrayList<Player> battlePlayers,ArrayList<Enemy> battleEnemys){
		for(int i =0;i<battlePlayers.size();i++){
			order.add(i,battlePlayers.get(i));
		}
		for(int i =0;i<battleEnemys.size();i++){
			order.add(i+battlePlayers.size(),battleEnemys.get(i));
		}
		for(int i =0;i<order.size()-1;i++){
			for(int j =i+1;j<order.size();j++){
				if(order.get(i).agi<order.get(j).agi){
					Chara temp = order.get(i);
					order.set(i,order.get(j));
					order.set(j,temp);
				}
			}
		}
	}
	public void turn(ArrayList<Player> battlePlayers,ArrayList<Enemy> battleEnemys,int turnCount){
		System.out.printf("----ターン%d----%n",turnCount);
		for(int i =0;i<order.size();i++){
			isAliveP = false;
			isAliveE = false;
			for(int j =0;j<order.size();j++){
				if(order.get(j).isAlive==true && order.get(j) instanceof Player){
					isAliveP = true;
				}else if(order.get(j).isAlive==true && order.get(j) instanceof Enemy){
					isAliveE = true;
				}
			}
			if(!isAliveP || !isAliveE){
				return;
			}
			if(order.get(i).isAlive==true){
				order.get(i).act(order);
			}
		}
		isAliveP = false;
		isAliveE = false;
		for(int j =0;j<order.size();j++){
			if(order.get(j).isAlive==true && order.get(j) instanceof Player){
				isAliveP = true;
			}else if(order.get(j).isAlive==true && order.get(j) instanceof Enemy){
				isAliveE = true;
			}
		}
	}
	/*public void statusIndi(ArrayList<Player> battlePlayers){
		for(int i =0;i<battlePlayers;i++){
		System.out.printf("%s:hp(%d/%d),sp(%d/%d)%n",battlePlayers.get(i),,,,)
		}
		}*/
}
