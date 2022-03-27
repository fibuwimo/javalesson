import java.util.*;
public class RpgMenu{
	public static void main(String[] args){
		int[][] charaState = {{10,30,10,5},{7,20,8,3},{7,25,7,4},{10,25,12,4}};
		String[] stateName = {"Lv","Hp","攻撃力","防御力"};
		String[] partyList = {"1:アレックス","2:リナックス","3:レナックス","4:クレアス","5:戻る"};
		int[] itemQuan = {0,3,4,2};
		String[] itemList = {"1:レベルの種","2:体力の種","3:力の種","4:守りの種","5:戻る"};
		String[] menuList = {"1:パーティ","2:アイテム","3:クエスト(未実装)","4:？？？(未実装)","5:終わる",};
		int menuListAns;
		do{
			menuListAns = listIndi(menuList);
			switch(menuListAns){
				case 1:
					party(charaState,partyList);
					break;
				case 2:
					item(itemList,itemQuan,partyList,charaState);
					break;
				case 3:
					break;
				case 4:
					break;
				case 5:
					break;
			}
		}while(menuListAns!=5);
	}
	public static int listIndi(String[] listName){ 
		int ans;
		do{
			System.out.println("◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆");
			for(int i = 0;i<listName.length;i++){
				System.out.println(listName[i]);
			}
			System.out.println("◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆");
			System.out.print("どうする？(1～"+listName.length+")>>");
			ans = new Scanner(System.in).nextInt();
		}while(ans < 1 || ans >listName.length);
		return ans;
	}
	public static void party(int[][] charaState,String[] partyList){
		int partyListAns;
		do{
			partyListAns = listIndi(partyList);
			switch(partyListAns){
				case 5:
					break;
				case 1:
				case 2:
				case 3:
				case 4:
					charaInfo(partyListAns,partyList,charaState);
			}
		}while(partyListAns!=5);
	}
	public static void charaInfo(int who,String[] partyList,int[][] charaState){
		String[] stateName = {"Lv","Hp","攻撃力","防御力"};
		System.out.println("◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆");
		System.out.println(partyList[who-1]);
		for(int i = 0;i<charaState[who-1].length;i++){
			System.out.print(stateName[i]+":");
			System.out.println(charaState[who-1][i]);
		}
		System.out.println("◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆");
		System.out.println("戻る(キー＋エンター)>>");
		String ans = new Scanner(System.in).next();
	}
	public static void item(String [] itemList,int [] itemQuan,String[] partyList,int[][] charaState){
		int itemListAns;
		do{
			itemListAns = listIndi(itemList);
			switch(itemListAns){
				case 5:
					break;
				case 1:
				case 2:
				case 3:
				case 4:	
					itemUse(itemListAns,itemList,itemQuan,partyList,charaState);
			}
		}while(itemListAns!=5);
	}
	public static void itemUse(int itemListAns,String [] itemList,int [] itemQuan,String[] partyList,int[][] charaState){
		String[] stateName = {"Lv","Hp","攻撃力","防御力"};
		if(itemQuan[itemListAns-1]>0){
			System.out.println(itemList[itemListAns-1]+"×"+itemQuan[itemListAns-1]);
			int useAns = listIndi(partyList);
			if(useAns>=1 && useAns<=4){
				charaState[useAns-1][itemListAns-1]++;
				itemQuan[itemListAns-1]--;
				System.out.println(partyList[useAns-1]+"に"+itemList[itemListAns-1]+"を使った！");
				System.out.println(partyList[useAns-1]+"の"+stateName[itemListAns-1]+"が1上がった！");
			}
		}else{
		System.out.println(itemList[itemListAns-1]+"は"+itemQuan[itemListAns-1]+"個なので使えない！");
		}
	}
}
