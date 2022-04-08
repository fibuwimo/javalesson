import java.util.*;
public class Lesson2{
	public static void main(String[] args){
		System.out.print("年月をカンマ区切りで入力>>");
		String yearMonthAns = new Scanner(System.in).nextLine();
		int[] yearMonth = csvToIntArr(yearMonthAns);
	}
	public static int[] csvToIntArr(String csv){
		String [] yearMonth = csv.split(",");
		int[] yearMonth ={
			Integer.parseInt(yearMonth[0]),
			Integer.parseInt(yearMonth[1]),
		}
		return yearMonth;

	}
	public static void daysOfmonth(String yearMonthAns){
		String [] yearMonth = yearMonthAns.split(",");
		int year = Integer.parseInt(yearMonth[0]);
		int month = Integer.parseInt(yearMonth[1]);
		int days;
		switch(month){
			case 2:
				if(year%400==0){
					days=29;
				}else if(year%4==0 && year%100!=0){
					days=29;
				}else{
					days=28;
				}
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				days=30;
				break;
			default:
				days=31;
		}
		System.out.printf("%d年%d月の日数は%d日です。%n",year,month,days);
	}
}
