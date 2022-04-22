import java.util.*;
public class WorkerApp{
	public static void main(String[] args){
		int n =3;
		System.out.printf("あなたの部下に%d人配属されました%n",n);
		OfficeWorker[] workers= new OfficeWorker[n];
		makeWorker(workers);
		indiWorker(workers);
		System.out.println("アプリケーションを終了します。");
	}
	public static void makeWorker(OfficeWorker[] workers){
		Scanner sc = new Scanner(System.in);
		Random rnd = new Random();
		for(int i=0;i<workers.length;i++){
			System.out.print(i+1+"人目の名前を入力してください>");
			String name = sc.nextLine();
			int idx = rnd.nextInt(3);
			switch(idx){
				case 0:
					workers[i] = new OrdinaryOfficeWorker(name);
					break;
				case 1:
					workers[i] = new EliteOfficeWorker(name);
					break;
				case 2:
					workers[i] = new LazyOfficeWorker(name);
					break;
			}
		}
	}
	public static void indiWorker(OfficeWorker[] workers){
		Scanner sc = new Scanner(System.in);
		while(true){
			System.out.println("誰の働きぶりを見にいきますか?");
			for(int i=0;i<workers.length;i++){
				System.out.printf("%d・・・%s%n",i,workers[i].name);
			}
			System.out.printf("%d・・・%s%n",workers.length,"終了");
			System.out.print("番号を入力してください>");
			int idx = sc.nextInt();
			if(idx==workers.length)break;
			workers[idx].work();
		}
	}
}
abstract class OfficeWorker{
	String name;
	OfficeWorker(String name){
		this.name=name;
		this.introduce();
	}
	public void introduce(){
		System.out.printf("はじめまして。私は%sです。%n",this.name);
	}
	public abstract void work();
}

class OrdinaryOfficeWorker extends OfficeWorker{
	OrdinaryOfficeWorker(String name){
		super(name);
	}
	public void work(){
		System.out.printf("%sは９時から５時まで働いている。遅刻や欠勤はない",this.name);
	}
}

class EliteOfficeWorker extends OfficeWorker{
	EliteOfficeWorker(String name){
		super(name);
	}
	public void work(){
		System.out.printf("%sは仕事がはやい！しかも正確だ。",this.name);
	}
}

class LazyOfficeWorker extends OfficeWorker{
	LazyOfficeWorker(String name){
		super(name);
	}
	public void work(){
		System.out.printf("%sはPCの画面を即座に切り替えた。何をしていたのだろう。",this.name);
	}
}
