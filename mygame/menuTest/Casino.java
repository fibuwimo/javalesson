import java.util.*;
public class Casino{
	String[] casinoList ={
		"コイン購入",
		"景品交換(未実装)",
		"ハイ＆ロー",
	};
	public Casino(){
		while(true){
			switch(this.menuIndi()){
				case 0:
					return;
				case 1:
					this.buy();
					break;
				case 2:
					break;
				case 3:
					this.highLow();
					break;
			}
		}
	}
	public int menuIndi(){
		System.out.println("↓--------カジノ--------↓");
		System.out.printf("所持金:%dG,コイン:%d枚%n",Player.money,Player.coin);
		for(int i= 0;i<casinoList.length;i++){
			System.out.printf("%d:%s%n",i+1,casinoList[i]);
		}	
		System.out.println("0:戻る");
		System.out.println("↑----------------------↑");
		int menuNum;
		do{
			System.out.printf("1~%d or 0>>",casinoList.length);
			menuNum = new Scanner(System.in).nextInt();
		}while(menuNum>casinoList.length || menuNum<0);
		return menuNum;
	}
	public void buy(){
		while(true){
			System.out.println("↓-----コイン購入所-----↓");
			System.out.printf("所持金:%dG,コイン:%d枚%n",Player.money,Player.coin);
			System.out.println("1:100G→コイン1枚");
			System.out.println("2:1000G→コイン11枚");
			System.out.println("3:10000G→コイン130枚");
			System.out.println("0:戻る");
			System.out.println("↑----------------------↑");
			int buyNum;
			do{
				System.out.print("1~3 or 0>>");
				buyNum = new Scanner(System.in).nextInt();
			}while(buyNum>3 || buyNum<0);
			switch(buyNum){
				case 0:
					return;
				case 1:
					if(Player.money<100){
						System.out.println("所持金が足りない……");
						break;
					}else{
						System.out.printf("所持金:%dG→%dG,コイン:%d枚→%d枚%n",Player.money,Player.money-100,Player.coin,Player.coin+1);
						Player.money -=100;
						Player.coin +=1;
					}
					break;
				case 2:
					if(Player.money<1000){
						System.out.println("所持金が足りない……");
						break;
					}else{
						System.out.printf("所持金:%dG→%dG,コイン:%d枚→%d枚%n",Player.money,Player.money-1000,Player.coin,Player.coin+11);
						Player.money -=1000;
						Player.coin +=11;
					}
					break;
				case 3:
					if(Player.money<10000){
						System.out.println("所持金が足りない……");
						break;
					}else{
						System.out.printf("所持金:%dG→%dG,コイン:%d枚→%d枚%n",Player.money,Player.money-10000,Player.coin,Player.coin+130);
						Player.money -=10000;
						Player.coin +=130;
					}
					break;
			}
		}
	}
	public void highLow(){
		System.out.println("↓-----------ハイ＆ロー-----------↓");
		System.out.println("ルール");
		System.out.println("次のカードが今のカードより高いか低いかを当てる");
		System.out.println("賭けコインは1枚、当たるごとに2倍、外したら負け");
		System.out.printf("コイン:%d枚%n1:やる%n0:やめとく%n",Player.coin);
		int ans = 2;
		do{
			System.out.print("1 or 0>>");
			ans = new Scanner(System.in).nextInt();
		}while(ans!=0 && ans!=1);
		if(ans==0){
			return;
		}
		if(Player.coin<1){
			System.out.println("コインが足りない……");
			return;
		}
		System.out.printf("コイン:%d枚→%d枚%n",Player.coin,Player.coin-1);
		Player.coin -=1;
		int bet =1;
		int n = new Random().nextInt(13)+1;
		while(true){
			int m = 0;
			int hL;
			do{
				System.out.printf("現在のカードは%dです、次のカード(1～13)は?%n",n);
				System.out.printf("1:ハイ%n0:ロー%n");
				do{
					System.out.print("1 or 0>>");
					hL = new Scanner(System.in).nextInt();
				}while(hL!=1 && hL!=0);
				m = new Random().nextInt(13)+1;
				if(n==m){
					System.out.printf("%d→%d,引き分け！%n",n,m);
				}
			}while(n==m);
			if(n<m && hL==0 || n>m && hL==1){
				System.out.printf("%d→%d,負け……%n",n,m);
				return;
			}
			System.out.printf("%d→%d,勝ち！%n",n,m);
			n=m;
			System.out.printf("ベットコイン:%d枚→%d枚%n",bet,bet*2);
			bet *=2;
			System.out.printf("1:続ける%n0:ベットコインを獲得して終わる%n");
			int conti =2;
			do{
				System.out.print("1 or 0>>");
				conti = new Scanner(System.in).nextInt();
			}while(conti!=0 && conti!=1);
			if(conti==0){
				System.out.printf("%d枚のコインを獲得した！%n",bet);
				System.out.printf("コイン:%d枚→%d枚%n",Player.coin,Player.coin+bet);
				Player.coin += bet;
				return;
			}
		}
	}
}
