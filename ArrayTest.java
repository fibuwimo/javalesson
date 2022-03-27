import java.util.*;
public class ArrayTest{
	public static void main(String[] args){
		int[] paraP = {1,15,10,5};
		int[] paraE = {1,10,8,5};
		String[] paraN ={"Lv","Hp","攻撃力","防御力"};
		for(int i =0;i<5;i++){
			paraE[1]=10;
			System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
			System.out.println("エネミーが現れた！");
			paraIndi("プレイヤー",paraP,paraN);
			paraIndi("エネミー",paraE,paraN);
			while(true){
				int damageAns = damage("プレイヤー",paraP[2],"エネミー",paraE[3]);
				paraE[1] -= damageAns;
				paraIndi("プレイヤー",paraP,paraN);
				paraIndi("エネミー",paraE,paraN);
				if(paraE[1]<=0){
					System.out.println("エネミーを倒した！");
					break;
				}
				damageAns = damage("エネミー",paraE[2],"プレイヤー",paraP[3]);
				paraP[1] -= damageAns;
				paraIndi("プレイヤー",paraP,paraN);
				paraIndi("エネミー",paraE,paraN);
				if(paraP[1]<=0){
					System.out.println("GameOver……");
					break;
				}
			}
		}
	}
	public static void paraIndi(String paraIndiName,int[] para,String[] paraN){
		System.out.println(paraIndiName+"情報");
		for(int i = 0;i < para.length;i++){
			System.out.print(paraN[i]+":");
			System.out.println(para[i]);
		}
	}
	public static int damage(String atName,int at,String boName,int bo){
		int damageAns = at - bo;
		if(damageAns<0){
			damageAns = 0;
		}
		System.out.println();
		System.out.println("＊"+atName+"の攻撃！"+boName+"に"+damageAns+"のダメージを与えた！");
		return damageAns ;
	}
}
