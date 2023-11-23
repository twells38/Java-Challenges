/*Given an integer array numbers, find the contiguous sub array( containing at least one number)
which has the larger sum and return its sum.*/
public class MaximumSubArray {
    public static void main(String[] args) {
      int[] numbers = new int []{-2,1,-3,4,-1,2,1,-5,4}; //declare array literal
        System.out.println(maxSubArray(numbers));
    }
    public static int maxSubArray(int[] numbers){
        if(numbers.length == 0 ) return 0;
        int maxSum = numbers[0];
        int sum = maxSum;
        for(int i = 0; i < numbers.length;i++){
            sum = Math.max(sum + numbers[i], numbers[i]);
            if(sum > maxSum){
                maxSum = sum;
            }
        }
        return maxSum;
    }
}
