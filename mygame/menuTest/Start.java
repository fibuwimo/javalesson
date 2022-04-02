import java.util.*;
public class Start{
	public static void main(String[] args){
		ArrayList<Player> players = new ArrayList<Player>();
		Hero h1 = new Hero("勇者A",20,20,0,5,7,4,11);
		players.add(h1);
		Hero h2 = new Hero("勇者B",30,30,0,6,8,6,5);
		players.add(h2);
		Hero h3 = new Hero("勇者C",40,40,0,2,9,7,1);
		players.add(h3);
		Hero h4 = new Hero("勇者D",10,10,0,0,50,2,0);
		players.add(h4);
		Hero h5 = new Hero("勇者E",100,100,0,0,5,0,10);
		players.add(h5);
		MainMenu mMenu = new MainMenu(players);
	}
}
