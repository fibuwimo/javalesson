import java.util.*;
public class MainMenu{
	String[] menuLists = {
		"パーティ",
		"アイテム(未実装)",
		"クエスト",
		"ショップ(未実装)",
		"カジノ(未実装)",
		"終わる",
	};
	public MainMenu(ArrayList<Player> players){
		while(true){
			menuIndi();
			switch(menuChois()){
				case 0:
					System.out.println("0");
					return;
				case 1:
					PartyMenu pM = new PartyMenu(players);
					break;
				case 2:
					System.out.println("2");
					break;
				case 3:
					Quest qu = new Quest(players);
					break;
				case 4:
					System.out.println("4");
					break;
				case 5:
					System.out.println("5");
					break;
			}
		}
	}
	public void menuIndi(){
		System.out.println("↓----メインメニュー----↓");
		for(int i =0;i<menuLists.length-1;i++){
			System.out.printf("%d:%s%n",i+1,menuLists[i]);
		}
		System.out.println("0:戻る");
		System.out.println("↑----------------------↑");
	}
	public int menuChois(){
		System.out.printf("1~%d or 0>>",menuLists.length-1);
		int menuNum = new Scanner(System.in).nextInt();
		return menuNum;
	}
}
