public class AssetsApp{
	public static void main(String[] args){
		Book b =new Book("Java入門",2600,"白","2314");
		b.setWeight(1500.0);
		System.out.printf("%s%n%d%n%s%n%s%n%.1f%n",b.getName(),b.getPrice(),b.getColor(),b.getIsbn(),b.getWeight());
	}
}
abstract class Asset{
	String name;
	int price;
	public Asset(String name,int price){
		this.name=name;
		this.price=price;
	}
	public String getName(){
		return this.name;
	}
	public int getPrice(){
		return this.price;
	}
}

interface Thing{
	double getWeight();
	void setWeight(double weight);
}

abstract class TangibleAsset extends Asset implements Thing{
	String color;
	double weight;
	public TangibleAsset(String name,int price,String color){
		super(name,price);
		this.color=color;
	}
	public String getColor(){
		return this.color;
	}
	public double getWeight(){
		return this.weight;
	}
	public void setWeight(double weight){
		this.weight=weight;
	}
}
abstract class IntangibleAsset extends Asset{
	public IntangibleAsset(String name,int price){
		super(name,price);
	}
}
class Book extends TangibleAsset{
	String isbn;
	public Book(String name,int price,String color,String isbn){
		super(name,price,color);
		this.isbn=isbn;
	}
	public String getIsbn(){
		return this.isbn;
	}
}
class Computer extends TangibleAsset{
	String makerName;
	public Computer(String name,int price,String color,String makerName){
		super(name,price,color);
		this.makerName=makerName;
	}
	public String getMakerName(){
		return this.makerName;
	}
}
