package chapter11;

//	Напишете програма, която извежда на стандартния изход броя на дните,
//	часовете и минутите, които са изтекли от 1 януари 1970 година до
//	момента на изпълнението на програмата. За реализацията използвайте
//	класа System.
public class CountDDHHMM {
	static long time = System.currentTimeMillis();
	static int n = 60000;
	
	private static long countMinutes(){
		long minutes = time / n;
		return minutes;
	}
	
	private static long countHours(){
		long hours = time / (60 * n);
		return hours;
	}
	
	private static long countDays(){
		long days = time / (60 * n * 24);
		return days;
	}

	public static void main(String[] args){
		System.out.printf("It has been %d days, %d hours and %d minutes since 1st January 1970.", 
				countDays(), countHours(), countMinutes());
	}
}
