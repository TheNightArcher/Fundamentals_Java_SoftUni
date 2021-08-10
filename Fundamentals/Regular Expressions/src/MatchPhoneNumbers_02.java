import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchPhoneNumbers_02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        String regex = "\\+359(?<seperator>[- ])2\\1\\d{3}\\1\\d{4}\\b";

        StringBuilder result = new StringBuilder();

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(scanner.nextLine());

        while (matcher.find()) {
            result.append(matcher.group()).append(", ");
        }
        result.deleteCharAt(result.length() - 2);
        System.out.print(result);
    }
}
