import java.util.*;
public class LessonNt3{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("金融商品A（口）>>");
		int numA = scan.nextInt();
		System.out.print("金融商品B（口）>>");
		int numB = scan.nextInt();
		System.out.print("金融商品C（口）>>");
		int numC = scan.nextInt();
		System.out.print("運用期間（年）>>");
		int year = scan.nextInt();
		int money = 2000-numA*100-numB*200-numC*500;
		int moneyA = stockA(numA,year);
		int moneyB = stockB(numB,year);
		int moneyC = stockC(numC,year);
		int moneySum = money+moneyA+moneyB+moneyC;
		System.out.printf("現金が%d万円、金融商品Aが%d万円、金融商品Bが%d万円、金融商品Cが%d万円、合計%d万円の資産があります。%n",money,moneyA,moneyB,moneyC,moneySum);
		scan.close();
	}

	static int stockA(int n,int y){
		int money = 100*n;
		for(int i=0;i<y;i++){
			money += n*2;
		}
		return money;
	}
	static int stockB(int n,int y){
		int money = 200*n;
		for(int i=0;i<y;i++){
			int rnd =new Random().nextInt(10);
			if(rnd<6){
				money += n*10;
			}else{
				money -= n*4;
			}
		}
		return money;
	}
	static int stockC(int n,int y){
		int money = 500*n;
		for(int i=0;i<y;i++){
			int rnd =new Random().nextInt(10);
			if(rnd<8){
				money += n*50;
			}else{
				return 0;
			}
		}
		return money;
	}
}
