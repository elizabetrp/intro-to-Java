package test.examples;

import test.Cat;
import test.Sequence;

public class Test {
	static Cat myCat = new Cat("Pesho", "black");
	static Sequence seq = new Sequence();
	
//	Дефинирайте свой собствен пакет chapter10 (в случая е test) и поставете в него двата
//	класа Cat и Sequence, които използвахме в примерите на текущата тема.
//	Направете още един собствен пакет с име chapter10.examples (test.examples) и в него
//	направете клас, който извиква класовете Cat и Sequence.
	
	public static void main(String[] args){
		System.out.printf("My cat is called %s and is %s.\n", myCat.name, myCat.color);
		myCat.sayMiau();
		System.out.println();
		System.out.printf("%d %d %d %d", seq.nextValue(), seq.nextValue(), seq.nextValue(), seq.nextValue());
	}
}
