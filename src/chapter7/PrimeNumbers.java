package chapter7;

/**
 * Напишете програма, която намира всички прости числа в диапазона [1..10 000 000]
 */
public class PrimeNumbers {

	public static void main(String[] args){
		int[] primes = new int[999];
		int length = primes.length;

		//You can do this with 2 loops
		for(int i = 2, j = 0; i <= 1000; i++, j++){
			primes[j] = i;
		}
		
		for(int i = 0; i < length; i += 2){
			if(primes[i] % 2 == 0 && primes[i] != 0 && primes[i] != 2){
				primes[i] = -1;
			}
		}
		for(int i = 1; i < length; i += 3){
			if(primes[i] % 3 == 0 && primes[i] != 3){
				primes[i] = -1;
			}
		}
		for(int i = 3; i < length; i += 5){
			if(primes[i] % 5 == 0 && primes[i] != 5){
				primes[i] = -1;
			}
		}
		for(int i = 0; i < length; i++){
			if(primes[i] > 0){
				System.out.printf("%d ", primes[i]);
			}
		}
	}
}
