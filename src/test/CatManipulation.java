package test;

import test.Cat;
import test.Sequence;

public class CatManipulation {
	
//	Напишете програма, която създава 10 обекта от тип Cat, дава им имена
//	от вида CatN, където N e уникален пореден номер на обекта, и накрая
//	извиква метода sayMiau() на всеки от тях. За реализацията използвайте
//	вече дефинирания пакет chapter10 (test).
	
//	Не е завършена.
	
	public static void main(String[] args){
		Cat[] array = new Cat[10];
		for(int i = 0; i < 10; i++){
			array[i] = new Cat("Cat" + Sequence.nextValue(), "brown");
		}
		
		for (Object Cat : array){
			((test.Cat) Cat).sayMiau();
		}
	}
}
