
import java.util.Scanner;

public class CharacterMultiplier_02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        String one = input[0];
        String two = input[1];

        int sum = getSumOfMultipliedCharacters(one, two);
        System.out.print(sum);
    }

    private static int getSumOfMultipliedCharacters(String one, String two) {
        int sum = 0;
        char[] firstString = one.toCharArray();
        char[] secondString = two.toCharArray();
        int minLength = Math.min(firstString.length, secondString.length);

        for (int i = 0; i < minLength; i++) {
            sum += firstString[i] * secondString[i];
            firstString[i] = (char) 0;
            secondString[i] = (char) 0;
        }
        if (firstString.length != secondString.length) {
            char[] longestString;
            if (firstString.length > secondString.length) {
                longestString = firstString;
            } else {
                longestString = secondString;
            }
            for (char symbol : longestString) {
                sum += symbol;
            }
        }
        return sum;
    }
}