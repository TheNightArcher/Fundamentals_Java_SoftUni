import java.util.Scanner;

public class SumOf_Odds_09 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int counter = 0;
        int sum = 0;

        for (int i = 1; i <= 100; i++) {

            if (i % 2 != 0 && counter < n) {

                System.out.println(i);
                sum += i;
                counter++;

            }
        }
        System.out.printf("Sum: %d", sum);
    }
}
