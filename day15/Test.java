import java.util.*;
public class Test{
	public static void main(String[] args){
		double pie = 3.141592653589;
		System.out.printf("%07.3f%n",pie);
		System.out.printf("%07.4f%n",pie);
		System.out.printf("%.8f%n",pie);
		double k =3.6;
		System.out.printf("%.0f%n",k);
		System.out.printf("%d%n",(int)k);
		String str = "194574";
		int n = Integer.parseInt(str);
		System.out.printf("%,d%n",n);
		char[] alph = {'a','b','c','d','e'};
		for(char c:alph){
			System.out.print(c);
		}
		System.out.println();
		String num ="43675";
		char[] nums = num.toCharArray();
		for(char e:nums){
			System.out.print(e);
		}
		System.out.println();
		String num2 = num.substring(0,3);
		System.out.println(num2);

	}
}
