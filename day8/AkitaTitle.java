public class AkitaTitle{
	public static void main(String[] args){
		for(int i=0;i<9;i++){
			for(int j=0;j<9;j++){
				System.out.print(Math.abs(j-4)<=Math.abs(i-4)?"*":" ");
			}
			System.out.println();
		}
	}
}
