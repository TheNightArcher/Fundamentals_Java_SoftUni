import java.util.Scanner;

public class LettersChangeNumbers_08 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        String[] input = scanner.nextLine().split("\\s+");

        double sum = 0;
        for (String letter : input) {

            double modifiedNumber = turnModified(letter);
            sum += modifiedNumber;
        }
        System.out.printf("%.2f",sum);
    }

    private static double turnModified(String letter) {

        char first = letter.charAt(0);
        char second = letter.charAt(letter.length() - 1);

        double number = Double.parseDouble(letter.substring(1, letter.indexOf(second)));


        if (Character.isUpperCase(first)) {
            int positionInUpper = (int) first - 64;
            number /= positionInUpper;
        } else {
            int positionInLower = (int) first - 96;
            number *= positionInLower;
        }


        if (Character.isUpperCase(second)) {
            int positionInUpper = (int) second - 64;
            number -= positionInUpper;
        } else {
            int positionInLower = (int) second - 96;
            number += positionInLower;
        }

        return number;
    }
}
