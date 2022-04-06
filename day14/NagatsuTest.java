import java.util.*;
public class NagatsuTest{
	public static void main(String[] args){
		String[] words ={"A","B","C","D","E"};
		System.out.print("行数>>");
		int n = new Scanner(System.in).nextInt();
		Random rnd = new Random();
		for(int i =0;i<n;i++){
			int idx = rnd.nextInt(10)+1;
			for(int j=0;j<idx;j++){
				System.out.print(words[rnd.nextInt(4)]);
			}
			System.out.println();
		}
	}
}
