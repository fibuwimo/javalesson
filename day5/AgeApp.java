import java.util.*;
public class AgeApp{
	public static void main(String[] args){
		System.out.print("age>>");
		int age = new Scanner(System.in).nextInt();
		if(age>=65){
		System.out.println("高齢者です");
		}
		else if(age>=20){
		System.out.println("大人です");
		}
		else{
		System.out.println("子供です");
		}
	}
}
