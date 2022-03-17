import java.util.*;
public class Ex2_3{
 public static void main(String[] args){
  System.out.println("ようこそ占いの館へ");
  System.out.print("あなたの名前>>");
  String name = new Scanner(System.in).nextLine();
  System.out.print("貴方の年齢>>");
  String ageString = new Scanner(System.in).nextLine();
	int age = Integer.parseInt(ageString);
	int fortune = new Random().nextInt(3);
	++fortune;
  System.out.println("占いの結果が出ました！");
  System.out.println(age+"歳の"+name+"さん、あなたの運気番号は"+fortune+"です");
  System.out.println("1:大吉 2:中吉 3:吉 4:凶");
 }
}
