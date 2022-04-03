import java.util.*;
public class Inn{
	public Inn(ArrayList<Player> players){
		System.out.println("-------------宿屋-------------");
		this.indi(players);
		int price = 50;
		System.out.printf("店主「宿代は%dGです、お泊りになりますか？」%n",price);
		while(true){
			System.out.printf("1:泊まる(hp全回復,sp0)%n0:やめとく%n");
			System.out.print(">>");
			int ans = new Scanner(System.in).nextInt();
			if(ans==0){
				return;
			}else if(ans==1){
				for(int i =0;i<players.size();i++){
					players.get(i).setSp(0);
					players.get(i).setHp(players.get(i).maxHp);
				}
				System.out.printf("%dG→%dG%n",Player.money,Player.money-price);
				Player.money -=price;
				System.out.println("店主「昨晩はお楽しみでしたね」");
				this.indi(players);
				System.out.print("エンターで戻る>>");
				new Scanner(System.in).nextLine();
				return;
			}
		}
	}
	public void indi(ArrayList<Player> players){
		System.out.println("------------------------------");
		System.out.printf("所持金:%dG%n",Player.money);
		for(int i =0;i<players.size();i++){
			System.out.printf("|%4s|",players.get(i).name);
		}
		System.out.println();
		for(int i =0;i<players.size();i++){
			System.out.printf("|hp:%2d/%2d|",players.get(i).hp,players.get(i).maxHp);
		}
		System.out.println();
		for(int i =0;i<players.size();i++){
			System.out.printf("|sp:%2d/%2d|",players.get(i).sp,players.get(i).maxSp);
		}
		System.out.println();
		System.out.println("------------------------------");
	}
}
