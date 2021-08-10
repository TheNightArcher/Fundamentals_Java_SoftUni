import java.util.Scanner;

public class TextFilter_04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] words = scanner.nextLine().split(", ");

        String text = scanner.nextLine();

        for (String forbiddenWord : words) {

            String wordsStars = convertWords(forbiddenWord);
            text = text.replace(forbiddenWord, wordsStars);
        }
        System.out.println(text);
    }

    private static String convertWords(String forbiddenWord) {

        return "*".repeat(forbiddenWord.length());
    }
}
