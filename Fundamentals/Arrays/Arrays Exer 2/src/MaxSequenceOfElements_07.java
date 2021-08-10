import java.util.Arrays;
import java.util.Scanner;

public class MaxSequenceOfElements_07 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int length = 1;
        int maxLength = 0;
        int startingIndex = 0;
        int bestIndex = 0;

        for (int i = 1; i <= numbers.length - 1; i++) {

            if (numbers[i] == numbers[i - 1]) {
                length++;
            } else {
                length = 1;
                startingIndex = i;
            }

            if (length > maxLength) {
                maxLength = length;
                bestIndex = startingIndex;
            }
        }

        for (int i = bestIndex; i < bestIndex + maxLength; i++) {

            System.out.print(numbers[i] + " ");
        }
    }
}
