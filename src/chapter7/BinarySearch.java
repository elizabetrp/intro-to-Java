package chapter7;

public class BinarySearch {
//	Да се реализира двоично търсене (binary search) в сортиран
//	целочислен масив.

	public static void main(String[] args){
		int[] primes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};
		
		int length = primes.length;
		int min = 0;
		int max = length - 1;
		int guess = 68;
		int mid = 0;
		
		for(int i = 0; i < length; i++){
			mid = (max + min) / 2;
			if(primes[mid] == guess){
				System.out.println(guess);
				break;
			}else if(primes[mid] < guess){
				min = mid + 1;
			}else {
				max = mid - 1;
			}
		}
		if(primes[mid] != guess){
			System.out.printf("%d does not belong to the array.", guess);
		}
	}
}
