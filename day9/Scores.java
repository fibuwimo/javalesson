import java.util.*;
public class Scores{
	public static void main(String[] args){
		System.out.print("何人>>");
		int n = new Scanner(System.in).nextInt();
		int[] scores = new int[n];
		for(int i=0;i<n;i++){
			scores[i] = new Random().nextInt(101); 
		}
		System.out.println(Arrays.toString(scores));
		int sum =0;
		for(int i=0;i<n;i++){
			sum += scores[i];
		}
		System.out.println("点数の合計は:"+sum);
		System.out.println("平均点:"+sum/scores.length);
		int max =scores[0];
		int min =scores[0];
		for(int i=1;i<n;i++){
			if(scores[i]>max){
				max = scores[i];
			}
			if(scores[i]<min){
				min = scores[i];
			}
		}
		System.out.println("最高点:"+max);
		System.out.println("最低点:"+min);
	}
}
