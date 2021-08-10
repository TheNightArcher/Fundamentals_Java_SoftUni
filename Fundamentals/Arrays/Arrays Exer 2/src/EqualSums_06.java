import java.util.Arrays;
import java.util.Scanner;

public class EqualSums_06 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        boolean isEqual = false;

        for (int i = 0; i < numbers.length; i++) {

            int sumLeft = 0;
            int sumRight = 0;

            for (int j = 0; j < i; j++) {
                sumLeft += numbers[j];
            }

            for (int k = i + 1; k <= numbers.length - 1; k++) {
                sumRight += numbers[k];
            }

            if (sumLeft == sumRight) {
                System.out.println(i);
                isEqual = true;
                break;
            }
        }
        if (!isEqual) {
            System.out.println("no");
        }
    }
}
