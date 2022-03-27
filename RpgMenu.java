import java.util.*;
public class RpgMenu{
	public static void main(String[] args){
		int[][] charaState = {{10,30,10,5},{7,20,8,3},{7,25,7,4},{10,25,12,4}};
		String[] partyList = {"1:アレックス","2:リナックス","3:レナックス","4:クレアス","5:戻る"};
		String[] menuList = {"1:パーティ","2:アイテム(未実装)","3:クエスト(未実装)","4:？？？(未実装)","5:終わる",};
		int menuListAns;
		do{
			menuListAns = listIndi(menuList);
			switch(menuListAns){
				case 1:
					party(charaState,partyList);
					break;
				case 2:
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
			System.out.println("◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆");
			for(int i = 0;i<listName.length;i++){
				System.out.println(listName[i]);
			}
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
		System.out.println("◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆");
		System.out.println(partyList[who-1]);
		for(int i = 0;i<charaState[who-1].length;i++){
			System.out.print(stateName[i]+":");
			System.out.println(charaState[who-1][i]);
		}
		System.out.println("戻る(キー＋エンター)>>");
		String ans = new Scanner(System.in).next();
	}
}
