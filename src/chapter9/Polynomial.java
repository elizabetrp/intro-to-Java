package chapter9;

public class Polynomial {
	public static void multiplyPolynomials(double arr1[], double arr2[]){
	    double multiplier;
		
		for(int i = 0, n = arr1.length - 1; i < arr1.length; i++, n--){
			for(int j = 0, k = arr2.length - 1; j < arr2.length; j++, k--){
				multiplier = arr1[i] * arr2[j];
				if(i == 0 && j == 0){
					System.out.printf(multiplier + "x%dy%d", n, k);
				}else if(multiplier > 0){
					System.out.printf(" + " + multiplier + "x%dy%d", n, k);
				}else{
					System.out.printf(" + " + "(" + multiplier + ")" + "x%dy%d", n, k);
				}
			}
		}
	}
	
//	Напишете метод, който умножава два многочлена.
	
	public static void main(String[] args){
		//Do not hardcode values in methods
	    //You should pass the arrays here
		double[] arr1 = {5, 2, 3, -1, 2};
		double[] arr2 = {2, -1, 4, 4};
		multiplyPolynomials(arr1, arr2);
	}
}
