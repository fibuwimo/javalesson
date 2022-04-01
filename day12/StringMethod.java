import java.util.*;
public class StringMethod{
	public static void main(String[] args){
		String fruits="apple";
		System.out.println(fruits.length());
		for(int i=0;i<fruits.length();i++){
			System.out.println(fruits.charAt(i));
		}
		char[] data = fruits.toCharArray();
		System.out.println(Arrays.toString(data));
		if(fruits.contains("pp")){
			System.out.println("ppを含みます");
		}
		if(fruits.equals("apple")){
			System.out.println("appleと等しい");
		}
		if(fruits.equalsIgnoreCase("apple")){
			System.out.println("appleと等しい");
		}
		System.out.println(fruits.toUpperCase());
		System.out.println(fruits.toLowerCase());
		if(fruits.startsWith("a")){
			System.out.println("aで始まります");
		}
		if(fruits.endsWith("s")){
			System.out.println("sで終わります");
		}
		String str2 = fruits.substring(0,3);
		System.out.println(str2);
		String str3 = fruits.substring(2,4);
		System.out.println(str3);
		String str4 = fruits.substring(0,fruits.length()-1);
		System.out.println(str4);
		char[] chars = new char[10];
		char alph = 'a';
		for(int i =0;i<chars.length;i++){
			chars[i]=alph;
			alph += 1;
		}
		System.out.println(chars);
	}
}
