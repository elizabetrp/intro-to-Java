package test;

public class Sequence {
	
	private static int currentValue = 0;
	
	public Sequence() {
	}
	
	public static int nextValue() {
		currentValue++;
		return currentValue;
	}

}
