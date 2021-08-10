import java.util.Arrays;
import java.util.Scanner;

public class EqualArrays_06 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] firstArray = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();


        int [] secondArray = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        int sum = 0;
        boolean isRight = true;

        for (int i = 0; i < secondArray.length; i++) {
            sum += secondArray[i];

            if (firstArray[i] != secondArray[i]){
                System.out.printf("Arrays are not identical. Found difference at %d index.",i);
                isRight = false;
                break;
            }
        }
        if (isRight){
            System.out.printf("Arrays are identical. Sum: %d",sum);
        }
    }
}
