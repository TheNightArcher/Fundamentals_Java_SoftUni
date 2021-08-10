import java.util.Scanner;

public class Special_Numbers_10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        int number = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= number; i++) {

            int lastDigit = i % 10;
            int firstDigit = i / 10;

            if (i == 5 || i == 7 ) {
                System.out.printf("%d -> True%n", i);
            } else if (firstDigit + lastDigit == 5) {
                System.out.printf("%d -> True%n", i);
            } else if (firstDigit + lastDigit == 7) {
                System.out.printf("%d -> True%n", i);
            } else if (firstDigit + lastDigit == 11) {
                System.out.printf("%d -> True%n", i);
            } else {
                System.out.printf("%d -> False%n", i);
            }

        }
    }
}
