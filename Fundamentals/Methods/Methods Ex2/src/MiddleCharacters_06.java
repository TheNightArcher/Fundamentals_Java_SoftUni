import java.util.Scanner;

public class MiddleCharacters_06 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();


        findMiddleChars(text);
    }

    private static void findMiddleChars(String text) {


        if (text.length() % 2 != 0) {

            int middleChar = text.length() / 2;

            System.out.printf("%c",text.charAt(middleChar));
        } else {

            int firstChar = text.length() / 2 - 1;
            int secondChar = text.length() / 2;

            System.out.printf("%c%c",text.charAt(firstChar),text.charAt(secondChar));
        }

    }
}
