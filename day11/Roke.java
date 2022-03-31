import java.util.*;
public class Roke{
	public static void main(String[] args){
		final String[] PENS ={"A","B","C","D","E"};
		System.out.println(Arrays.toString(PENS));
		while(true){
			System.out.print("もう一度？(適当なキー:もう一度　or　q:終わる)>>");
			String ans = new Scanner(System.in).next();
			if(ans.equals("q")){
				break;
			}
			String temp = PENS[0];
			for(int i=0;i<PENS.length-1;i++){
				PENS[i]=PENS[i+1];
			}
			PENS[PENS.length-1] = temp;
			System.out.println(Arrays.toString(PENS));
		}
	}
}
