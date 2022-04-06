import java.util.*;
public class RandomTest{
	public static void main(String[] args){
		Random rnd = new Random();
		Scanner scan = new Scanner(System.in);
		int n= scan.nextInt();
		int[] data=new int[n];
		for(int i=0;i<data.length;i++){
			data[i]=rnd.nextInt(6);
		}
		System.out.println(Arrays.toString(data));
	}
}
