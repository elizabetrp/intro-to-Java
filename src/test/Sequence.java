package test;

public class Sequence {
	
	private static int currentValue = -1;
	
	public Sequence() {
	}
	
	public int nextValue() {
		currentValue++;
		return currentValue;
	}

}
