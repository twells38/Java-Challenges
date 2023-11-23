import java.util.Scanner;

/*Alice and Bob created one problem for hackerRank. A review rates the two challenges, awarding points on a scales from 1 to 100 for three categories
* problem clarity, originality, difficulty*/
public class CompareTriplets {
    public static final int SIZE = 3;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] aList = new int[SIZE];
        int[] bList = new int[SIZE];

        //populate the arrays
        System.out.println("Enter elements for Alice array: ");
        for(int i = 0; i < SIZE;i++){
            aList[i] = input.nextInt();
        }
        System.out.println("Enter elements for Bob array: ");
        for(int i = 0; i < SIZE ; i++){
            bList[i] = input.nextInt();
        }
        //compare each the value of each index
        int sumRatingA = 0;
        int sumRatingB = 0;
        for(int i = 0; i < SIZE;i++){
            if (aList[i] > bList[i]) {
               sumRatingA++;
            }else if(aList[i] < bList[i]){
                sumRatingB++;
            }
        }
        System.out.println("Sum of rating of Alice: " + sumRatingA+"\n" + "Sum of rating of Bob: "+ sumRatingB);
    }
}
