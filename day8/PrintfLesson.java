import java.util.*;
public class PrintfLesson{
	public static void main(String[] args){
		System.out.println(Math.PI);
		System.out.printf("%.2f%n",Math.PI);
		System.out.println("Hello");
		long num = 1145141919810l;
		System.out.printf("%,d%n",num);
		String name ="山田";
		int age =23;
		System.out.printf("こんにちは%s(%d歳)さん！%n",name,age);
		System.out.printf("%,6d%n",34);
		System.out.printf("%,6d%n",3724);
		System.out.printf("%,6d%n",285);
		System.out.printf("%,6d%n",94733);
	}
}
