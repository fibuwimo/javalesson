import java.util.*;
public class PartyMenu{
	public PartyMenu(ArrayList<Player> players){
		while(true){
			this.menuIndi(players);
			int menuNum = menuChois(players);
			switch(menuNum){
				case 0:
					System.out.println("0");
					return;
				case -1:
					this.change(players);
					break;
				default:
					players.get(menuNum-1).statusIndi();
			}
		}
	}
	public void menuIndi(ArrayList<Player> players){
		System.out.println("↓----パーティメンバー----↓");
		for(int i =0;i<players.size();i++){
			System.out.printf("%d:%s%n",i+1,players.get(i).getName());
			if(i==2){
				System.out.println("----↑戦闘↑/↓控え↓----");
			}
		}
		System.out.println("0:戻る");
		System.out.println("-1:並び替え");
		System.out.println("↑------------------------↑");
	}
	public int menuChois(ArrayList<Player> players){
		int menuNum;
		do{
			System.out.printf("1~%d or 0 or -1>>",players.size());
			menuNum = new Scanner(System.in).nextInt();
		}while(menuNum>players.size() || menuNum<-1);
		return menuNum;
	}
	public void change(ArrayList<Player> players){
		System.out.println("↓-----並び替え-----↓");
		for(int i =0;i<players.size();i++){
			System.out.printf("%d:%s%n",i+1,players.get(i).getName());
			if(i==2){
				System.out.println("----↑戦闘↑/↓控え↓----");
			}
		}
		System.out.println("↑------------------↑");
		int n1;
		int n2;
		do{
			System.out.printf("誰を？(1~%d)>>%n",players.size());
			n1 = new Scanner(System.in).nextInt();
		}while(n1>players.size() || n1<1);
		do{
			System.out.printf("誰と？(1~%d)>>%n",players.size());
			n2 = new Scanner(System.in).nextInt();
		}while(n2>players.size() || n2<1);
		Player temp = players.get(n1-1);
		players.set(n1-1,players.get(n2-1));
		players.set(n2-1,temp);
	}
}
