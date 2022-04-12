import java.util.*;
public class Lesson9{
	static double calcBMI(double weightKg,double heightCm){
		return weightKg/(heightCm/100*heightCm/100);
	}
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("体重を入力してください(kg)>");
		double weightKg = scan.nextDouble();
		System.out.print("身長を入力してください(cm)");
		double heightCm = scan.nextDouble();
		double bmi = calcBMI(weightKg,heightCm);
		System.out.printf("体重:%.1fkg,身長:%.1fcmのBMIは%.1fです。%n",weightKg,heightCm,bmi);
		scan.close();
	}
}
