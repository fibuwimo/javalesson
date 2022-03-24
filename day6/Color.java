import java.util.*;
public class Color{
	public static void main(String[] args){
		System.out.print("何色？>");
		String color = new Scanner(System.in).next();
		switch(color){
			case "赤":
				System.out.println("Red");
				break;
			case "青":
				System.out.println("Blue");
				break;
			case "黄":
			case "黄色":
				System.out.println("Yellow");
				break;
			default:
				System.out.println("わかりません");
		}
	}
}
