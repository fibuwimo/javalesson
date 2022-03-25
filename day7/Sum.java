import java.util.*;
public class Sum{
	public static void main(String[] args){
		int sum = 0;
		System.out.print("小さい数>>");
		int min = new Scanner(System.in).nextInt();
		System.out.print("大きい数>>");
		int max = new Scanner(System.in).nextInt();
		for(int i=min;i<=max;i++){
			sum += i;
		}
		System.out.println(min+"から"+max+"までの和は"+sum+"です。");
	}
}
