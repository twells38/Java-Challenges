/*Given an integer array numbers, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
* Note that you must do this-plate without making a copy of the array.
* numbers = [0,1,0,3,12]
* output:[1,3,12,0,0]
* */

import java.sql.SQLOutput;
import java.util.Scanner;

public class MoveZero {
    public static void main(String[] args) {

        int[] numbers = new int[]{0, 1, 0, 3, 12};
        moveZeroToEnd(numbers);
        System.out.print("Array after pushing zeros to the end : ");
        for(int i = 0; i<numbers.length;i++){
            System.out.print(numbers[i]+" "); // print out elements in the array.
        }
    }

    public static void moveZeroToEnd(int[]nums) {

        int nonZero = 0;
        int zero = 0;
        while (nonZero < nums.length) {
            if (nums[nonZero] != 0) {
                int temp = nums[nonZero];
                nums[nonZero] = nums[zero];
                nums[zero] = temp;
                nonZero++;
                zero++;
            } else {
                nonZero++;
            }
        }

    }
}

