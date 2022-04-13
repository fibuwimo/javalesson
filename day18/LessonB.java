import java.util.*;
public class LessonB{
	public static void main(String[] args){
		String[] statsNames={"体力","魔力","パワー","きようさ","すばやさ"};
		String[] raceNames={"人間","ハイエルフ","トロル","ノーム"};
		String[] jobNames={"戦士","盗賊","僧侶","魔術師"};
		int[][] raceBonus ={
			{10,10,10,10,10},
			{0,20,0,10,20},
			{30,0,20,0,0},
			{10,0,0,25,20},
		};
		double[][] jobBonus ={
			{1.6,1,1.4,1,1},
			{1.1,1,1.2,1.3,1.3},
			{1.3,1.5,1.1,1,1},
			{1,1.9,1,1,1.1},
		};
		int[] statsNums= new int[statsNames.length];
		System.out.print("名前を入力してください>");
		String name = new Scanner(System.in).nextLine();
		int seed = seedDeside(name);
		statsDeside(statsNums,seed);
		System.out.println("初期ステータスが決定しました");
		statsIndi(statsNums,statsNames);
		System.out.print("種族を選んでください");
		int race =chois(raceNames);
		raceAdd(statsNums,raceBonus[race]);
		System.out.printf("%sのボーナスが適用されました!%n",raceNames[race]);
		statsIndi(statsNums,statsNames);
		System.out.print("職業を選んでください");
		int job =chois(jobNames);
		jobTime(statsNums,jobBonus[job]);
		System.out.printf("%sのボーナスが適用されました!%n",jobNames[job]);
		statsIndi(statsNums,statsNames);
		int sum =sum(statsNums);
		System.out.println("***作成成功!***");
		System.out.printf("私は%sの%s、%Sです。%n",jobNames[job],raceNames[race],name);
		System.out.printf("能力値(%d)を高い順に並べると%n",sum);
		sortIndi(statsNums,statsNames);
		System.out.println("です。今後ともよろしく…。");
	}

	static int seedDeside(String name){
		int seed=0;
		for(int i=0;i<name.length();i++){
			seed += name.charAt(i);
		}
		return seed;
	}
	static void statsDeside(int[] arrI,int seed){
		Random rnd = new Random(seed);
		for(int i=0;i<arrI.length;i++){
			arrI[i] = i<2?rnd.nextInt(100)+1:rnd.nextInt(50)+1;
		}
	}
	static void statsIndi(int[] arrI,String[] arrS){
		System.out.print("[");
		for(int i=0;i<arrI.length;i++){
			System.out.printf("%s:%d ",arrS[i],arrI[i]);
		}
		System.out.println("]");
	}
	static int chois(String[] arrS){
		String sumS="";
		for(int i=0;i<arrS.length;i++){
			sumS +=(i+"…"+arrS[i]+",");
		}
		sumS = sumS.substring(0,sumS.length()-1);
		System.out.print(sumS+">");
		return new Scanner(System.in).nextInt();
	}
	static void raceAdd(int[] arr,int[] arrA){
		for(int i=0;i<arr.length;i++){
			arr[i] += arrA[i];
		}
	}
	static void jobTime(int[] arr,double[] arrT){
		for(int i=0;i<arr.length;i++){
			arr[i] = (int)(arr[i]*arrT[i]);
		}
	}
	static int sum(int[] arr){
		int sum =0;
		for(int i=0;i<arr.length;i++){
			sum += arr[i];
		}
		return sum;
	}
	static void sortIndi(int[] arrI,String[] arrS){
		for(int i=0 ;i<arrI.length;i++){
			for(int j=i+1;j<arrI.length;j++){
				if(arrI[i]<arrI[j]){
					int temp1 = arrI[i];
					arrI[i] = arrI[j];
					arrI[j] = temp1;
					String temp2 = arrS[i];
					arrS[i] = arrS[j];
					arrS[j] = temp2;
				}
			}
			System.out.printf("%s:%d%n",arrS[i],arrI[i]);
		}
	}
}
