package chapter9;

public class HelloName {
	public static void name(String name){
		System.out.printf("Hello, %s!", name);
	}
	
//	Напишете метод, който при подадено име отпечатва в конзолата "Hello,
//	<name>!" (например "Hello, Peter!"). Напишете програма, която тества
//	този метод.
	
	public static void main(String[] args){
		name("Peter");
	}
}
