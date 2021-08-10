import java.math.BigDecimal;
import java.util.Scanner;

public class Exact_Sum_03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int times = Integer.parseInt(scanner.nextLine());

        BigDecimal sum = new BigDecimal(0);

        for (int i = 0; i < times ; i++) {

            BigDecimal value = new BigDecimal(scanner.nextLine());

            sum = sum.add(value);
        }

        System.out.print(sum);
    }
}
