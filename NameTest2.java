public class NameTest2{
	public static void main(String[] args){
		talk("いろはにほへとちりぬるを");
		talk("わかよたれそつねならむ");
		talk("うゐのおくやまけふこえて");
		talk("あさきゆめみしゑひもせすん");
	}
	public static void talk(String sen){
		for(int i=0;i<sen.length(); i++){
			System.out.print(sen.charAt(i));
			try{
				Thread.sleep(100);
			}
			catch(InterruptedException e){
			}
		}
		try{
			Thread.sleep(1000);
		}
		catch(InterruptedException e){
		}
		System.out.println("");
	}
}
