import java.util.Scanner;

public class TopNumber_10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i <= n; i++) {
            if (checkIfItIsTop(i)) {
                System.out.println(i);
            }
        }
    }

    private static boolean checkIfItIsTop(int n) {
        boolean isOdd = false;
        int sum = 0;
        int num = n;
        while (num > 0) {
            int digit = num % 10;
            if (digit % 2 != 0) {
                isOdd = true;
            }
            sum += digit;
            num /= 10;
        }
        return sum % 8 == 0 && isOdd;

    }
}
