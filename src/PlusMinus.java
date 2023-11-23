import java.util.Scanner;

public class PlusMinus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter array size: ");
        int size = input.nextInt();
        System.out.println("Enter array elements: ");
        int[] array = new int[size];
        for(int i = 0 ; i < array.length; i++){
            array[i] = input.nextInt();
        }
         plusMinus(array);       //[1,1,,0,-1,-1]
    }

    public static void plusMinus(int[] array){
        int positiveNumberCount = 0;
        int negativeNumberCount = 0;
        int zeroCount = 0;
        for(int i = 0; i < array.length;i++){
            if(array[i] > 0){
               positiveNumberCount++;
            } else if (array[i] < 0) {
                negativeNumberCount++;
            }else {
                zeroCount++;
            }

        }
        System.out.println("Positive number ratio: " + (float)positiveNumberCount/ array.length);
        System.out.println("Negative number ratio: " + (float)negativeNumberCount/ array.length);
        System.out.println("Zero ratio: " + (float)zeroCount/ array.length);
    }
}
