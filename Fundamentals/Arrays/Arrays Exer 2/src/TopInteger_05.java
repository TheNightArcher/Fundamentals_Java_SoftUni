import java.util.Arrays;
import java.util.Scanner;

public class TopInteger_05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();


        for (int elements = 0; elements < numbers.length ; elements++) {
            boolean isBigger = true;
            for (int j =  elements + 1; j < numbers.length; j++) {

                if (numbers[elements] <= numbers[j]){
                    isBigger = false;
                    break;
                }
            }

            if (isBigger){
                System.out.print(numbers[elements]+ " ");
            }
        }

    }
}
