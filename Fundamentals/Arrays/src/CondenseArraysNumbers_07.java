import java.util.Arrays;
import java.util.Scanner;

public class CondenseArraysNumbers_07 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        int numbersMinus1 = numbers.length - 1;
        int[] discount = new int[numbers.length];

        while (numbersMinus1 > 0) {
            for (int i = 0; i < numbersMinus1; i++) {
                discount[i] = numbers[i] + numbers[i + 1];
            }

            for (int i = 0; i < numbersMinus1; i++) {
                numbers[i] = discount[i];
            }
            numbersMinus1 -= 1;
        }
        System.out.println(numbers[0]);
    }
}

