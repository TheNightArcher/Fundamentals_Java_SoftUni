import java.util.Scanner;

public class Division_02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int divider = 0;

        if (n % 10 == 0) {
            divider = 10;
        } else if (n % 7 == 0) {
            divider = 7;
        } else if (n % 6 == 0) {
            divider = 6;
        } else if (n % 3 == 0) {
            divider = 3;
        } else if (n % 2 == 0) {
            divider = 2;
        }

        if (divider == 0) {
            System.out.print("Not divisible");
        } else {
            System.out.printf("The number is divisible by %d", divider);
        }
    }
}
