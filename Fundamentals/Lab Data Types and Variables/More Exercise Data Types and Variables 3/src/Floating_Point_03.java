import java.math.BigDecimal;
import java.util.Scanner;

public class Floating_Point_03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        BigDecimal numberA = new BigDecimal(scanner.nextLine());
        BigDecimal numberB = new BigDecimal(scanner.nextLine());

        BigDecimal difference = (numberA.subtract(numberB).abs());

        if (numberA.compareTo(numberB) == 0) {
            System.out.println("True");
        } else {
            if (difference.compareTo(BigDecimal.valueOf(0.000001)) == -1) {
                System.out.println("True");
            } else {
                System.out.println("False");
            }
        }


    }
}
