public class ColorPencil{
	static int totalDraw=0;
	String color;
	int num;
	int length;
	ColorPencil(String color,int num,int length){
		this.color=color;
		this.num=num;
		this.length = length;
		this.showStatus();
	}
	void showStatus(){
		System.out.print(this.color+":");
		for(int i=0;i<this.length;i++){
			System.out.print("-");
		}
		System.out.println(">");
	}
	void draw(){
		if(this.length<=0){
			System.out.println("もう描けません");
			return;
		}
		totalDraw++;
		System.out.printf("%sで描いた%n",this.color);
		this.length--;
		this.showStatus();
	}
	static int getTotalDraw(){
		return totalDraw;
	}
}
