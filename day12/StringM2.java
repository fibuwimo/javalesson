import java.util.*;
public class StringM2{
	public static void main(String[] args){
		System.out.print("英文>>");
		String cen = new Scanner(System.in).nextLine();
		int n =5;
		for(int i=0;i<cen.length();i+=n){
			String str;
			if(n<=cen.length()-i){	
				str = cen.substring(i,i+n);
			}else{
				str = cen.substring(i,cen.length());
			}
			System.out.println(str);
		}
	}
}
