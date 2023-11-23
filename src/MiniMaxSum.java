import java.lang.reflect.Array;
import java.security.spec.RSAOtherPrimeInfo;
import java.util.Arrays;
import java.util.Scanner;

/* Given five positive integers, find the  minimum and maximum values that can be calculated by summing exactly four of the five
* integers.Then print the respective minimum and maximum values as a single line of two space-separated long integers.
* arr = [1,3,5,7,8]
* the minimum sum is 1+3+5+7 = 16
* and the maximum sum is 3+5+7+9 = 24
* */
public class MiniMaxSum {
    public static final int SIZE = 5;
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter array's elements: ");
        int[] arr = new int[SIZE];
        for(int i = 0 ; i < SIZE; i++){
            arr[i] = input.nextInt();
        }
        miniMaxSum(arr);
    }
    static void miniMaxSum(int[] arr){
        //min, max, totalSum
        //sort the arry
        Arrays.sort(arr);
        // loop to find min sum
        int minSum = 0;
        for(int i = 0; i < SIZE-1;i++){
            minSum += arr[i];
        }
        //loop to find max Sum
        int maxSum = 0;
        for(int i = 1; i < SIZE;i++){
            maxSum += arr[i];
        }
        System.out.println("min sum is " + minSum +" ," + "max sum is " + maxSum);
    }
}
