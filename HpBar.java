import java.util.*;
public class HpBar{
	public static void main(String[] args){
		int maxHp = 10;
		int hp = 6;
		System.out.print("Hp:");
		for(int i=1;i<=maxHp;i++){
			System.out.print(i<=hp?"◆":"◇");
		}
		System.out.println();
		System.out.printf("   %d/%d%n",hp,maxHp);
	}
}
