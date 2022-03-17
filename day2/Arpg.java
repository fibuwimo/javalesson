public class Arpg{
	public static void main(String[] args){
		String name1="勇者ああああ";
		String name2="僧侶んんんん";
		int hp = 100;
		int cure = 30;
		System.out.println(name1+"と"+name2+"の冒険");
		System.out.println("スライムが出てきた！");
		System.out.println("スライムの先制攻撃");
		System.out.println(name1 + "は60のダメージを受けた");
		hp = hp - 60;
		System.out.println(name1+"(" + hp +")");
		System.out.println(name2+"のヒール！");
		System.out.println(name1 + "は"+cure+"回復した");
		hp = hp + cure;
		System.out.println(name1+"(" + hp +")");
		System.out.println(name1+"のマナブースト");
		System.out.println(name2+"の回復力が20上がった");
    cure=cure+20;
		System.out.println("スライムの攻撃");
		System.out.println(name1 + "は60のダメージを受けた");
		hp = hp - 60;
		System.out.println(name1+"(" + hp +")");
		System.out.println(name2+"のヒール！");
		System.out.println(name1 + "は"+cure+"回復した");
		hp = hp + cure;
		System.out.println(name1+"(" + hp +")");
		System.out.println("スライムの攻撃");
		System.out.println(name1 + "は60のダメージを受けた");
		hp = hp - 60;
		System.out.println(name1+"は力尽きた");
		System.out.println("GameOver");
	}
}

