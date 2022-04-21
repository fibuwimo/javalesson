import java.util.*;
public class BookApp{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("本のページ数を入力して下さい >");
		int page = sc.nextInt();
		System.out.print("本の価格を入力して下さい >");
		int price = sc.nextInt();
		Book b = new Book(page,price);
		System.out.print("ノートのページ数を入力して下さい >");
		page = sc.nextInt();
		System.out.print("ノートの価格を入力して下さい >");
		price = sc.nextInt();
		NoteBook nb = new NoteBook(page,price);

		while(true){
			System.out.print("1. 本の情報表示 / 2. ノートの情報表示 / 3. ノートに追加書込 / 4.   終了>");
			int ans = sc.nextInt();
			sc.nextLine();
			switch(ans){
				case 1:
					b.indi();
					break;
				case 2:
					nb.indi();
					break;
				case 3:
					System.out.print("書き込む内容を入力して下さい >");
					String add = sc.nextLine();
					nb.addWord(add);
					break;
				case 4:
					System.out.println("アプリケーションを終了します。");
					return;
			}
		}
	}
}

class Book{
	int page;
	int price;
	Book(int page,int price){
		this.page=page;
		this.price=price;
	}
	public void indi(){
		System.out.printf("ページ数：%d%n価格：%d%n",this.page,this.price);
	}
}

class NoteBook extends Book{
	String word="";
	NoteBook(int page,int price){
		super(page,price);
	}
	public void indi(){
		super.indi();
		System.out.printf("内容：%s%n",word);
	}
	public void addWord(String add){
		this.word += add;
	}
}
