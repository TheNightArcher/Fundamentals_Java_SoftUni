import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Numbers_03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        List<Integer> numbers = Arrays.stream(scanner.nextLine()
                .split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());


        IntSummaryStatistics average = numbers.stream().mapToInt((a) -> a).summaryStatistics();


        double ave = 100 * 1.0 / numbers.size();

        System.out.println(ave);
    }
}
