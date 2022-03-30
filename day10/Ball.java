import java.util.*;
public class Ball{
	public static void main(String[] args){
		int [] bNum = {1,2,3,4,5};
		for(int i=0;i<bNum.length-1;i++){
			int ran = new Random().nextInt(bNum.length-i)+i;
			int temp = bNum[ran];
			bNum[ran] = bNum[i];
			bNum[i] = temp;
		}
		for(int i=0;i<bNum.length;i++){
			System.out.println(bNum[i]);
		}
	}
}
