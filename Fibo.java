import java.util.*;
public class Fibo{
	public static void main(String[] args){
		int a = 1;
		int b = 1;
		System.out.print(a+",");
		System.out.print(b+",");
		int c = 0;
		for(int i=3;i<=40;i++){
			c=a+b;
			System.out.print(c+",");
			a=b;
			b=c;
			if(i%5==0){
			System.out.println();
			}
		}
	}
}
