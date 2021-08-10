import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SumEqualsNumbers_01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");

        List<Double> numbers = Arrays.stream(input)
                .map(Double::parseDouble).collect(Collectors.toList());

        for (int i = 0; i < numbers.size() - 1; i++) {


            if (numbers.get(i).equals(numbers.get(i + 1))) {
                double sum = numbers.get(i) + numbers.get(i + 1);
                numbers.set(i , sum);
                numbers.remove(i + 1);
                i = -1;
            }

        }

        DecimalFormat decimalFormat = new DecimalFormat("0.#");
        for (double number : numbers) {
            System.out.print(decimalFormat.format(number) + " " );
        }
    }
}
