import java.util.*;
public class Lesson10{
	static int calcTaxin(int priceSum ,int tax){
		return (int)(priceSum*(1+tax/100));
	}
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("消費税は何％ですか>");
		int tax = scan.nextInt();
		int priceSum=0;
		while(true){
			System.out.print("価格を入力(0でお会計)>");
			int price = scan.nextInt();
			if(price==0){
				break;
			}
			priceSum += price;
		}
		int taxin = calcTaxin(priceSum,tax);
		System.out.printf("お買い物合計金額は%d円(税込み)です。%n");
	}
}
