import java.util.Scanner;

public class SimpleArraySum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter size of the array: ");
        int size = input.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter elements for the array: ");
        for(int i = 0; i < size;i++){
            arr[i] = input.nextInt();
        }
        System.out.println(simpleArraySum(arr));
    }

    public static int simpleArraySum(int[] array){
        int sum = 0;
        for(int i = 0; i < array.length; i++){
            sum += array[i];
        }
        return sum;
    }
}
