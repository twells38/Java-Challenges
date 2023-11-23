/*Given an integer array arr, count element x such that x+1 is also in arr
* if there are duplicate in arr, count them separately.
* */

import java.util.Arrays;
import java.util.Scanner;

public class CountElements {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter size of the array: ");
        int size = input.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter elements for the array: ");
        for(int i = 0 ; i < size;i++){
            arr[i] = input.nextInt();
        }
        System.out.println("Count element : "+countElements(arr));

    }
    public static int countElements(int[] array) {
       boolean[] existsMap = new boolean[1002]; //[0,1001]
        for(int n : array){
            existsMap[n] = true;
        }
        int totalCount = 0;
        for(int n : array){
            if(existsMap[n+1]){
               totalCount++;
            }
        }
        return totalCount;
    }
}
