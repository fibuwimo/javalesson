public class Main{
	public static void main(String[] args){
		Matango m = new Matango();
		m.hp=10;
		Dancer d = new Dancer("踊り子ちゃん",50);
		d.dance();
		d.attack(m);
		Wizard w = new Wizard("ウィザードくん",70);
		w.indig(m);
		w.attack(m);
	}
}
