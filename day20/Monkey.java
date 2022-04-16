public class Monkey{
	String name;
	int year;
	public void act1(){
		System.out.printf("こんにちは%s(%d才)です。よろしく！%n",this.name,this.year);
	}
	public void act2(){
		System.out.printf("%sは上手に竹馬にのった%n",this.name);
	}
	public void act3(){
		System.out.printf("%sはひょいと逆立ちをした！%n",this.name);
	}
}
