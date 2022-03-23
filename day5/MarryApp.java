import java.util.*;
public class MarryApp{
	public static void main(String[] args){
		/*
		 *女性16歳
		 *男性18歳
		 * */
		System.out.print("性別(男性,女性)>>");
		String gender=new Scanner(System.in).next();
		System.out.print("年齢>>");
		int age=new Scanner(System.in).nextInt();
		if(gender.equals("女性")){
			if(age>=16){
			System.out.print(age+"歳で"+gender+"のあなたは結婚できます");
			}else{
			System.out.print(age+"歳で"+gender+"のあなたは結婚できません");
			}
		}else{
			if(age>=18){
			System.out.print(age+"歳で"+gender+"のあなたは結婚できます");
			}else{
			System.out.print(age+"歳で"+gender+"のあなたは結婚できません");
			}
		}
	}
}
