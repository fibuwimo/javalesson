import java.util.*;
public class Item{
	String name;
	int qty;
	public void count(int n){
		qty +=n;
		if(qty<0){
			qty =0;
		}
	}
}
