import java.util.*;
public class Jyanken{
	public static void main(String[] args){
		/*手を入力(グー：0、チョキ：1、パー：2)>>1
		 *あなたはチョキ、PCはパー
		 *あなたの勝ちです。
		 */
		System.out.print("手を入力(グー:0、チョキ:1、パー:2)>>");
		int np = new Scanner(System.in).nextInt();//npはプレイヤーの数
		int nc = new Random().nextInt(3);//ncは相手の数
		String jp;//jpはプレイヤーの手
		String jc;//jcは相手の手
		if(np%3==0){
			jp = "グー";
		}else if(np%3==1){
			jp = "チョキ";
		}else{
			jp = "パー";
		}
		if(nc%3==0){
			jc = "グー";
		}else if(nc%3==1){
			jc = "チョキ";
		}else{
			jc = "パー";
		}
		System.out.println("あなたは"+jp+"、PCは"+jc);
		if((nc+3-np%3)%3==1){
			System.out.print("あなたの勝ちです。");
		}else if((np%3+3-nc)%3==1){
			System.out.print("あなたの負けです。");
		}else{
			System.out.print("あいこです。");
		}
	}
}
