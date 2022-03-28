import java.util.*;
public class ForLesson{
	public static void main(String[] args){
		/*
			 for(int i=0;i<10;i++){
			 if(i % 3 == 0){
			 continue;
			 }
			 if(i % 5 == 0){
			 break;
			 }
			 System.out.println(i);
			 }
			 */
		for(int i =10;i<30;i+=10){
			for(int j=1;j<5;j++){
				System.out.println(i+j);
				if(j==3){
					return;
				}
			}
		}
	}
}
