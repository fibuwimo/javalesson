import java.util.*;
public class MainMenu{
	String[] menuLists = {
		"パーティ",
		"装備(未実装)",
		"アイテム(未実装)",
		"クエスト",
		"宿屋",
		"ショップ(未実装)",
		"カジノ",
	};
	public MainMenu(ArrayList<Player> players){
		while(true){
			menuIndi();
			switch(menuChois()){
				case 0:
					System.out.println("メニューを閉じました");
					return;
				case 1:
					PartyMenu pM = new PartyMenu(players);
					break;
				case 2:
					System.out.println("2");
					break;
				case 3:
					System.out.println("3");
					break;
				case 4:
					Quest qu = new Quest(players);
					break;
				case 5:
					Inn in = new Inn(players);
					break;
				case 6:
					System.out.println("6");
					break;
				case 7:
					Casino ca = new Casino();
					break;
			}
		}
	}
	public void menuIndi(){
		System.out.println("↓----メインメニュー----↓");
		System.out.printf("所持金:%dG%n",Player.money);
		for(int i =0;i<menuLists.length;i++){
			System.out.printf("%d:%s%n",i+1,menuLists[i]);
		}
		System.out.println("0:戻る");
		System.out.println("↑----------------------↑");
	}
	public int menuChois(){
		int menuNum;
		do{
		System.out.printf("1~%d or 0>>",menuLists.length);
		menuNum = new Scanner(System.in).nextInt();
		}while(menuNum>menuLists.length || menuNum<0);
		return menuNum;
	}
}
