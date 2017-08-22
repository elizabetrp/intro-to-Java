package chapter10;

import java.util.Arrays;
import java.util.Scanner;

public class SumOfSubsets {
	public static boolean isSubsetSum(int[] arr, int n, int sum){
        boolean[][] subset = new boolean[sum + 1][n + 1];

        for(int i = 0; i <= n; i++){
        	subset[0][i] = true;
        }

        for(int i = 1; i <= sum; i++){
        	subset[i][0] = false;
        }
            
        for(int i = 1; i <= sum; i++){
            for(int j = 1; j <= n; j++){
                subset[i][j] = subset[i][j-1];
                if(i >= arr[j - 1]){
                    subset[i][j] = subset[i][j] || subset[i - arr[j-1]][j-1];
                }
            }
        }
        System.out.println(Arrays.deepToString(subset));
        return subset[sum][n];
    }

//	Даден е масив с цели числа. Напишете програма, която проверява дали
//	в масива съществуват едно или повече числа, чиято сума е N.

	
    public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);

    	//You can extract all reading in separate class and use it everywhere.
        // You can have different methods there for reading different stuff
        System.out.print("Enter array length: ");
        int length = scan.nextInt();
        scan.nextLine();
        int[] arr = new int[length];

        for (int i = 0; i < length; i++){
        	System.out.printf("Enter %d element: ", i + 1);
            arr[i] = scan.nextInt();
        }

        System.out.print("Enter sum: ");
        int sum = scan.nextInt();

        if (isSubsetSum(arr, length, sum) == true){
        	System.out.println("Found a subset with given sum.");
        }else{
            System.out.println("No subset with given sum.");
        }
        
        
        
        scan.nextLine();
        
        scan.close();
    }
}
