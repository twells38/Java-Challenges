import java.util.Scanner;

/*A happy number is a number defined by the following process : Starting with any positive integer, replace
* the number by the sum of the squares of its digits and repeat the process until the number equals 1
* ( what us will stay), or it loops endlessly in a cycle which does not include 1. Those numbers for which this process ends in 1 are happy numbers.
*
* */
public class HappyNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter an integer number: ");
        int number = input.nextInt();
        int result = number;

        //invoke solution method
        while(result !=1 && result != 4){
            result = solution(result);
        }
        if(result == 1){
            System.out.println("It is a Happy number");
        }else{
            System.out.println("It is not a Happy number.");
        }

    }
    public static int solution(int n){
        int sum = 0;
        int digit ;
        while(n >0){
            digit = n % 10; //return remainder of division
            sum = sum + (digit * digit);
            n = n / 10;
        }
       return sum;
    }
}
