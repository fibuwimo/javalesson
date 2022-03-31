import java.util.*;
public class Sort{
	public static void main(String[] args){
		int[] data ={3,1,5,2,7};
		System.out.println(Arrays.toString(data));
		for(int i=0 ;i<data.length;i++){
			for(int j=i+1;j<data.length;j++){
				if(data[i]>data[j]){
					int temp = data[i];
					data[i] = data[j];
					data[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(data));
	}
}
