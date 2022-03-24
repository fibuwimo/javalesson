import java.util.*;
public class HighLow{
	public static void main(String[] args){
		/*
		 *ハイ＆ロー
		 *(現在の数字は1です(1~13)。ハイorロー？>>)
		 *ハイかローかを入力
		 *1→9、あなたの勝ちです。（負け）
		 */
		int n= new Random().nextInt(13)+1;
		System.out.print("現在の数字は"+n+"です(1~13)。High or Low ？>>");
		String c = new Scanner(System.in).next();
		int m= new Random().nextInt(13)+1;
		if(c.equalsIgnoreCase("High") && m>n || c.equalsIgnoreCase("Low") && m<n ){
			System.out.print(n+"→"+m+"、あなたの勝ちです");
		}else{
			System.out.print(n+"→"+m+"、あなたの負けです");
		}
	}
}
