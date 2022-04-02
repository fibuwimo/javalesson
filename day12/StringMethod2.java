import java.util.*;
public class StringMethod2{
	public static void main(String[] args){
		String str ="apple:orange:banana";
		str = str.replace(":",",");
		System.out.println(str);

		String[] data=str.split(",");
		System.out.println(Arrays.toString(data));

		String result = String.join(",",data);
		System.out.println(result);
	}
}
