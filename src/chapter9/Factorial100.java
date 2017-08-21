package chapter9;

public class Factorial100 {
	public static double factorial(double number){
        if (number <= 1){
        	return 1;
        }else{
            return number * factorial(number - 1);
        }
    }

//	Напишете програма, която пресмята и отпечатва n! за всяко n в
//	интервала [1..100].

	public static void main(String[] args){
		for(int i = 1; i < 101; i++){
			System.out.printf("%d! = %f\n", i, factorial(i));
		}
	}
}
