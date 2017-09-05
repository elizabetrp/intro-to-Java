package test;

import test.Cat;

public class CatManipulation {
	
//	Напишете програма, която създава 10 обекта от тип Cat, дава им имена
//	от вида CatN, където N e уникален пореден номер на обекта, и накрая
//	извиква метода sayMiau() на всеки от тях. За реализацията използвайте
//	вече дефинирания пакет chapter10 (test).
	
	public static void main(String[] args){
		for(int i = 1; i < 11; i++){
			Cat Cat = new Cat();
			Cat.name = "Cat" + i;
			Cat.sayMiau();
		}
	}
}
