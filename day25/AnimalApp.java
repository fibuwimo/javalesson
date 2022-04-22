import java.util.*;
public class AnimalApp{
	public static void main(String[] args){
		Animal[] animals = {
			new Dog("たろう"),
			new Pig("プーギー"),
			new Cat("タマ"),
		};
		for(Animal a:animals){
			a.makeNoise();
			if(a instanceof Cat){
				((Cat)a).sleep();
			}
		}
	}
}

abstract class Animal{
	String name;
	Animal(String name){
		this.name=name;
	}
	abstract void makeNoise();
}

class Dog extends Animal{
	Dog(String name){
		super(name);
	}
	@Override
	void makeNoise(){
		System.out.println(this.name+"は吠えた「ワン！！」");
	}
}
class Pig extends Animal{
	Pig(String name){
		super(name);
	}
	@Override
	void makeNoise(){
		System.out.println(this.name+"は鳴いた「ブーー」");
	}
}
class Cat extends Animal{
	Cat(String name){
		super(name);
	}
	@Override
	void makeNoise(){
		System.out.println(this.name+"は鳴いた「ニャーー」");
	}
	void sleep(){
		System.out.println(this.name+"は眠った");
	}
}
