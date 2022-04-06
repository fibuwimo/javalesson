import java.util.*;
public class JoyTest{
	public static void main(String[] args){
		Random rnd = new Random();
		int [][] sells =new int[12][31];
		for(int i=0;i<sells.length;i++){
			System.out.printf("%2d|",i+1);
			int day;
			int sum = 0;
			switch(i+1){
				case 1:
				case 3:
				case 5:
				case 7:
				case 8:
				case 10:
				case 12:
					day=31;
					break;
				case 2:
					day=28;
					break;
				default:
					day=30;
			}
			for(int j=0;j<day;j++){
				sells[i][j]=rnd.nextInt(41)+10;
				System.out.printf(" %2d",sells[i][j]);
				sum +=sells[i][j];
			}
			for(int j =0;j<sells[i].length-day;j++){
				System.out.printf(" %2s","*");
			}
			System.out.printf("|%4d%n",sum);
		}
	}
}
