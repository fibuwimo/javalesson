import java.util.*;
public class ColorPencilApp{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("何本>>");
		int n = sc.nextInt();
		ColorPencil[] cps = new ColorPencil[n];
		creatPencil(cps);
		while(true){
			System.out.println();
			int ans = menuIndi(cps);
			if(ans<cps.length){
				usePencil(cps,ans);
			}else if(ans==cps.length){
				totalDrawIndi();
			}else{
				System.out.println("終了");
				return;
			}
		}
	}

	public static void creatPencil(ColorPencil[] cps){
		Scanner sc = new Scanner(System.in);
		for(int i =0;i<cps.length;i++){
			System.out.print("色>>");
			String color = sc.next();
			System.out.print("長さ>>");
			int length = sc.nextInt();
			cps[i]=new ColorPencil(color,i,length);
		}
	}

	public static int menuIndi(ColorPencil[] cps){
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<cps.length+2;i++){
			if(i<cps.length){
				System.out.println(cps[i].num+","+cps[i].color);
			}else if(i==cps.length){
				System.out.println(i+".描いた長さのtotalを見る");
			}else{
				System.out.println(i+"終了");
			}
		}
		System.out.print("何で描く>>");
		return sc.nextInt();
	}

	public static void usePencil(ColorPencil[] cps,int ans){
		cps[ans].draw();
	}

	public static void totalDrawIndi(){
		int total = ColorPencil.getTotalDraw();
		System.out.printf("描いたtotalは%dです",total);
	}
}
