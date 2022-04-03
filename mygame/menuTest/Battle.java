import java.util.*;
public class Battle{
	ArrayList<Chara> order = new ArrayList<Chara>();
	boolean isAliveP = true;
	boolean isAliveE = true;
	public Battle(ArrayList<Player> battlePlayers,ArrayList<Enemy> battleEnemys,int dN){
		order.clear();
		for(int i =0;i<battlePlayers.size();i++){
			order.add(i,battlePlayers.get(i));
		}
		for(int i =0;i<battleEnemys.size();i++){
			order.add(i+battlePlayers.size(),battleEnemys.get(i));
		}
		System.out.println("---------バトル開始!----------");
		int turnCount =1;
		while(true){
			this.statusIndi(battlePlayers,battleEnemys);
			if(!isAliveP){
				System.out.println("敗北者じゃけぇ……");
				return;
			}else if(!isAliveE){
				System.out.println("勝利！");
				int gold =dN*dN*10;
				int exp =dN*50;
				System.out.printf("%dGと経験値%dを入手した！%n",gold,exp);
				System.out.printf("%dG→%dG%n",Player.money,Player.money+gold);
				Player.money += gold;
				for(int i=0;i<battlePlayers.size();i++){
					battlePlayers.get(i).fluctExp(exp);
				}
				return;
			}
			this.decideOrder();
			this.orderIndi();
			this.turn(battlePlayers,battleEnemys,turnCount);
			turnCount++;
		}
	}
	public void decideOrder(){
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
	public void orderIndi(){
		System.out.print("(行動順)");
		for(int i =0;i<order.size();i++){
			if(order.get(i).isAlive==true){
				System.out.printf(">%s",order.get(i).name);
			}
		}
		System.out.println();
	}
	public void turn(ArrayList<Player> battlePlayers,ArrayList<Enemy> battleEnemys,int turnCount){
		System.out.printf("-----------ターン%d------------%n",turnCount);
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
				System.out.println("------------------------------");
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
		System.out.println("------------------------------");
	}
	public void statusIndi(ArrayList<Player> battlePlayers,ArrayList<Enemy> battleEnemys){
		System.out.println("------------------------------");
		for(int i =0;i<battleEnemys.size();i++){
			System.out.printf("|%4s|",battleEnemys.get(i).name);
		}
		System.out.println();
		for(int i =0;i<battleEnemys.size();i++){
			System.out.printf("|hp:%2d/%2d|",battleEnemys.get(i).hp,battleEnemys.get(i).maxHp);
		}
		System.out.println();
		for(int i =0;i<battleEnemys.size();i++){
			System.out.printf("|sp:%2d/%2d|",battleEnemys.get(i).sp,battleEnemys.get(i).maxSp);
		}
		System.out.println();
		System.out.println("------------------------------");
		for(int i =0;i<battlePlayers.size();i++){
			System.out.printf("|%4s|",battlePlayers.get(i).name);
		}
		System.out.println();
		for(int i =0;i<battlePlayers.size();i++){
			System.out.printf("|hp:%2d/%2d|",battlePlayers.get(i).hp,battlePlayers.get(i).maxHp);
		}
		System.out.println();
		for(int i =0;i<battlePlayers.size();i++){
			System.out.printf("|sp:%2d/%2d|",battlePlayers.get(i).sp,battlePlayers.get(i).maxSp);
		}
		System.out.println();
		System.out.println("------------------------------");
	}
}
