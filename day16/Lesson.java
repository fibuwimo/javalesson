import java.util.*;
public class Lesson{
	public static void main(String[] args){
		System.out.print("縦>>");
		double h = new Scanner(System.in).nextDouble();
		System.out.print("横>>");
		double w = new Scanner(System.in).nextDouble();
		System.out.printf("長方形の面積は%.1fです%n",calc(h,w));
	}
	public static double calc(double h,double w){
		return h*w;
	}
}
