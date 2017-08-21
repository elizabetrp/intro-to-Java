package chapter10;

import java.util.Scanner;

public class Permutations {
	public static void getPermutations(int[] arr, int index){
        if(index == arr.length){
            System.out.print("{");
            for(int i = 0; i < arr.length; i++){
                if(i < arr.length - 1){
                	System.out.printf("%s, ", arr[i]);
                }else{
                	System.out.printf("%d} ", arr[i]);
                }
            }
        }else{
            for(int i = index; i < arr.length; i++){
	            int temp = arr[i];
	            arr[i] = arr[index];
	            arr[index] = temp;
	            getPermutations(arr, index + 1);
	            temp = arr[i];
	            arr[i] = arr[index];
	            arr[index] = temp;
            }
        }
    }

//	Напишете програма, която генерира и отпечатва пермутациите на
//	числата 1, 2, …, n, за дадено цяло число n.
//	Примерен вход:
//	n = 3
//	Примерен изход:
//	(1, 2, 3), (1, 3, 2), (2, 1, 3), (2, 3, 1), (3, 1, 2), (3, 2, 1)
	
    public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
    	
    	System.out.print("Enter N: ");
        int n = scan.nextInt();
        int[] arr = new int[n];
        
        for(int i = 0; i < arr.length; i++){
        	arr[i] = i + 1;
        }
        getPermutations(arr, 0);
        
        scan.close();
    }
}
