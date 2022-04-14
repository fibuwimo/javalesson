package divisorapp.main; 
import java.util.*;
import divisorapp.logics.*;
public class Method2{
	public static void main(String[] args){
		if(args.length==0){
			System.out.println("コマンドライン引数はありません");
			return;
		}
		for(String s :args){
			System.out.printf("%s:%s%n",s,Arrays.toString(Method2_1.calc(Integer.parseInt(s))));
		}
	}
}
