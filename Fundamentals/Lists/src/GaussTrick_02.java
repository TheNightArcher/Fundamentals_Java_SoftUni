import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class GaussTrick_02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");

        List<Integer> numbers = Arrays.stream(input).map(Integer::parseInt).collect(Collectors.toList());

        for (int i = 0; i < numbers.size() - 1; i++) {

           int sum = numbers.get(i) + numbers.get(numbers.size() - 1) ;
           numbers.set(i,sum);
           numbers.remove(numbers.size() -1);
        }
        numbers.forEach(number -> System.out.print(number + " "));
    }
}
