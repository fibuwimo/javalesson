import java.util.*;
public class LessonA{
	public static void main(String[] args){
		System.out.print("何人？>");
		int num = new Scanner(System.in).nextInt();
		System.out.print("何回振る？>");
		int turn = new Scanner(System.in).nextInt();
		int[] sums = new int[num];
		char[] chars = new char[num];
		char alph = 'A';
		for(int i=0;i<num;i++){
			int[] arr =diceRnd(turn);
			chars[i]=alph++;
			sums[i] =arrSum(arr);
			System.out.printf("%sさん:%s 合計:%d%n",chars[i],Arrays.toString(arr),sums[i]);
		}
		sort(sums,chars);
		whoWin(sums,chars);
	}
	static int[] diceRnd(int turn){
		int[] arr = new int[turn];
		Random rnd =new Random();
		for(int i=0;i<arr.length;i++){
			arr[i]=rnd.nextInt(6)+1;
		}
		return arr;
	}
	static int arrSum(int[] arr){
		int sum =0;
		for(int i=0;i<arr.length;i++){
			sum +=arr[i];
		}
		return sum;
	}
	static void sort(int[] arr1,char[] arr2){
		for(int i=0 ;i<arr1.length-1;i++){
			for(int j=i+1;j<arr1.length;j++){
				if(arr1[i]<arr1[j]){
					int temp1 = arr1[i];
					arr1[i] = arr1[j];
					arr1[j] = temp1;
					char temp2 = arr2[i];
					arr2[i] = arr2[j];
					arr2[j] = temp2;
				}
			}
		}
	}
	static void whoWin(int[] arr,char[] chars){
		int count =0;
		for(int i =1;i<arr.length;i++){
			if(arr[0]==arr[i]){
				count++;
			}
		}
		if(count==arr.length-1){
			System.out.println("引き分け");
			return;
		}
		System.out.printf("%sさん",chars[0]);
		for(int i =1;i<=count;i++){
			System.out.printf(",%sさん",chars[i]);
		}
		System.out.println("の勝ち");
	}
}
