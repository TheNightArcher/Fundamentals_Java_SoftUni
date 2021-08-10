import java.util.Scanner;

public class Strong_Number_06 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());


        int startingNumber = number;
        int sumFact = 0;

        while (number != 0) {

            int fact = 1;

            int lastDigit = number % 10;

            for (int i = 1; i <= lastDigit; i++) {

                fact *= i;
            }

            sumFact += fact;
            number /= 10;
        }


        if (startingNumber == sumFact) {

            System.out.print("yes");
        } else {
            System.out.print("no");
        }

    }
}
