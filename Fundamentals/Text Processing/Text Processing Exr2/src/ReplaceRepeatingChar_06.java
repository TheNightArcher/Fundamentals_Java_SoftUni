import java.util.Scanner;

public class ReplaceRepeatingChar_06 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        StringBuilder result = new StringBuilder();

        char firstChar = text.charAt(0);
        result.append(firstChar);

        for (char letter : text.toCharArray()) {

            char lastChar = result.charAt(result.length() - 1);

            if (lastChar != letter) {
                result.append(letter);
            }
        }
        System.out.println(result);
    }
}
