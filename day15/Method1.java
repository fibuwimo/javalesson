import java.util.*;
public class Method1{
	public static void main(String[] args){
		int max = maxOf(3,8);
		System.out.println(max);
		double area = calcTriangleArea(3.5,9);
		System.out.println(area);
		boolean isSame = isSame(new int[]{3,3,3});
		if(isSame){
		System.out.println("要素はすべて等しい");
		}
		int taxIn = calcTaxIn(300,10);
		System.out.printf("%d%n",taxIn);
		System.out.print("身長(cm)>>");
		double heightCm = new Scanner(System.in).nextInt();
		System.out.print("体重(kg)>>");
		double weightKg = new Scanner(System.in).nextInt();
		double bmi = calcBmi(weightKg,heightCm);
		System.out.printf("BMI:%.2f%n",bmi);

	}
	public static int maxOf(int a,int b){
		return a>b?a:b;
	}
	public static double calcTriangleArea(double bottom,double height){
		return (bottom*height)/2;
	}
	public static boolean isSame(int[] arr){
		if(arr==null){
			return false;
		}
		int first=arr[0];
		for(int i=1;i<arr.length;i++){
			if(first !=arr[i]){
				return false;
			}
		}
		return true;
	}
	public static int calcTaxIn(int price,int tax){
		return (int)(price*(1+tax/100d));
	}
	public static double calcBmi(double weightKg ,double heightCm ){
		return weightKg/(heightCm/100 * heightCm/100);
	}
}
