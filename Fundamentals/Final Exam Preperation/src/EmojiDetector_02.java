import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmojiDetector_02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        String emojiRegex = "(?<emoji>(?<seperator>[:]{2}|[*]{2})[A-Z][a-z]{2,}\\2)";

        Pattern emojiPattern = Pattern.compile(emojiRegex);
        Matcher emojiMatcher = emojiPattern.matcher(text);

        String digitRegex = "(?<digits>\\d)";
        Pattern digitPattern = Pattern.compile(digitRegex);
        Matcher digitMatcher = digitPattern.matcher(text);

        int coolSum = 1;
        while (digitMatcher.find()) {
            int digit = Integer.parseInt(digitMatcher.group("digits"));
            coolSum *= digit;
        }
        System.out.printf("Cool threshold: %d%n", coolSum);

        int counterEmoji = 0;
        List<String> coolOnce = new ArrayList<>();
        while (emojiMatcher.find()) {
            counterEmoji++;
            String emojis = emojiMatcher.group("emoji");
            coolOnce.add(emojis);
        }
       if (!(counterEmoji == 0)){
           System.out.printf("%d emojis found in the text. The cool ones are:%n", counterEmoji);
       }
        for (String cool : coolOnce) {
            int sum = 0;
            for (int i = 2; i < cool.length() - 2; i++) {
                char currentLetter = cool.charAt(i);
                sum += currentLetter;
            }
            if (sum > coolSum){
                System.out.println(cool);
            }
        }
    }
}
