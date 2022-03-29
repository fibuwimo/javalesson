import java.util.*;
public class For4{
	public static void main(String[] args){
		System.out.print("幅(2-9)>>");
		int n = new Scanner(System.in).nextInt();
		String atariFin = "揃ってない";
		for(int i =0;i<3;i++){
			boolean atari = true;
			for(int j=0,m=1,o=0;j<n;j++){
				m = new Random().nextInt(2)+1;
				System.out.print(m);
				if(o!=m && j>=1){
					atari=false;
				}
				o=m;
			}
			System.out.println();
			if(atari==true){
				atariFin = "揃った！";
			}
		}
		System.out.println(atariFin);
	}
}
