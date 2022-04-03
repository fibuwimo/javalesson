import java.util.*;
public class Start{
	public static void main(String[] args){
		ArrayList<Player> players = new ArrayList<Player>();
		Hero p1 = new Hero("ゆうしゃ",20,20,0,2,8,6,15);
		players.add(p1);
		Wizard p2 = new Wizard("魔法使い",15,15,0,1,8,4,4);
		players.add(p2);
		Cleric p3 = new Cleric("そうりょ",20,20,0,1,5,6,6);
		players.add(p3);
		Hero p4 = new Hero("ええええ",10,10,0,1,50,2,0);
		players.add(p4);
		Hero p5 = new Hero("おおおお",70,70,0,10,5,0,10);
		players.add(p5);
		MainMenu mMenu = new MainMenu(players);
	}
}
