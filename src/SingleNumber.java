import java.util.Scanner;

/*Given a non-empty array of integers, every element appears twice except for one. Find that single one.
* Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory*/
/*The XOR logical operation, exclusive or, takes two boolean operands and returns true if,
and only if, the operands are different.*/
public class SingleNumber {
    public static final int SIZE = 5;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter array's elements: ");
        int[] arr = new int[SIZE];
        for(int i = 0 ; i < SIZE; i++){
            arr[i] = input.nextInt();
        }
        System.out.println(singleNumber(arr));
    }
    //xor each number
    public static int singleNumber(int[] numbs){
        int output = 0;
        for(int num : numbs){
            output = output ^ num;
        }
        return output;
    }
}
