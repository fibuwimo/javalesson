import java.util.*;
public class PrimeNum{
	public static void main(String[] args){
		System.out.print("自然数を入力>>");
		int n = new Scanner(System.in).nextInt();
		int m = 2;
		String ans = "である";
		if(n<1){
			System.out.print("自然数ではない");
		}else{
			if(n==2){
				ans = "である";
			}else if(n==1||n%2==0){
				ans = "ではない";
			}else{
				do{
					if(n%m==0){
						ans = "ではない";
					}else{
					}
					m++;
				}while(m < n/2);
			}
			System.out.print("素数"+ans);
		}
	}
}
