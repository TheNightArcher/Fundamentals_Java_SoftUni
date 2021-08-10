import java.util.Scanner;

public class Messages_05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            String alphabet = "abcdefghijklmnopqrstuvwxyz";

            int mainDigit = number % 10;
            int counterDigit = 0;

            if (mainDigit >= 2) {

                for (int j = number; j > 0; j /= 10) {
                    counterDigit++;
                }

                int offset = (mainDigit - 2) * 3;

                if (mainDigit == 8 || mainDigit == 9) {
                    offset++;
                }

                int index = offset + counterDigit - 1;
                char letters = alphabet.charAt(index);
                System.out.print(letters);

            }else if (mainDigit == 0){
                System.out.print(" ");
            }
        }

    }
}
