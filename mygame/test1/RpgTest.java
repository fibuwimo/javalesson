import java.util.*;
public class RpgTest{
	public static void main(String[] args){
		System.out.print("名前を入力>>");
		String hName = new Scanner(System.in).nextLine(); 
		Hero h = new Hero(hName);
		Enemy e = new Enemy();
		Battle b = new Battle();
		b.battle1(h,e);
	}
}
