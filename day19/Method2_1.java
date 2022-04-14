package divisorapp.logics;
import java.util.*;
public class Method2_1{
	public static int[] calc(int n){
		int count =0;
		for(int i=1;i<=n;i++){
			if(n%i==0){
				count++;
			}
		}
		int[] retArr=new int[count];
		int idx =0;
		for(int i=1;i<=n;i++){
			if(n%i==0){
				retArr[idx++]=i;
			}
		}
		return retArr;
	}
}
