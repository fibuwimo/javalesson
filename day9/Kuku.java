import java.util.*;
public class Kuku{
	public static void main(String[] args){
		int st;
		int en;
		do{
			System.out.print("START>>");
			st = new Scanner(System.in).nextInt();
		}while(st<1 || st>9);
		do{
			System.out.print("END>>");
			en = new Scanner(System.in).nextInt();
		}while(en<1 || en>9 || en<st);
		for(int i=st;i<=en;i++){
			for(int j=1;j<=9;j++){
				int ans =i*j;
				System.out.printf("%d*%d=%2d ",i,j,ans);
			}
			System.out.println();
		}
	}
}
