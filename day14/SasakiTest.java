import java.util.*;
public class SasakiTest{
	public static void main(String[] args){
		char[][] map= new char[3][3];
		Scanner scan =new Scanner(System.in);
		for(int i =0;i<map.length;i++){
			for(int j =0;j<map[i].length;j++){
				map[i][j]='□';
			}
			System.out.println();
		}
		for(int i=0;i<9;i++){
			while(true){
				for(int j =0;j<map.length;j++){
					for(int k =0;k<map[j].length;k++){
						System.out.print(map[j][k]);
					}
					System.out.println();
				}

				System.out.printf("%sの人、入れる場所を選んでください%n",i%2==0?"先行":"後攻");
				System.out.print("上から何番目か");
				int h = scan.nextInt()-1;
				System.out.print("左から何番目か");
				int w = scan.nextInt()-1;
				if(map[h][w]=='□'){
					map[h][w]= (i%2==0?'○':'×');
					break;
				}
				System.out.printf("そこは既に埋まっています%n埋める場所を選びなおしてください%n");

			}
		}
		for(int j =0;j<map.length;j++){
			for(int k =0;k<map[j].length;k++){
				System.out.print(map[j][k]);
			}
			System.out.println();
		}
		System.out.println("全部埋まりました！");

	}
}
