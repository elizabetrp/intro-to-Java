package chapter6;

public class Cards {
	public static void main(String[] args){
		int[] cards = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
		int[] suits = {1, 2, 3, 4};
		
		for (int i : cards) {
			for (int j : suits) {
				System.out.println(i + " " + j);
			}
		}
	}
}