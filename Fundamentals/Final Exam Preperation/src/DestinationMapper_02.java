import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DestinationMapper_02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        String regex = "(?<seperator>[=|\\/])(?<text>[A-Z][A-Za-z]{2,})\\1";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        List<String> nameOfDestination = new ArrayList<>();
        while (matcher.find()) {
            nameOfDestination.add( matcher.group("text"));
        }
        int points = nameOfDestination.stream().mapToInt(String::length).sum();
        String result = String.join(", ",nameOfDestination);

        System.out.printf("Destinations: %s%n",result);
        System.out.printf("Travel Points: %d",points);

    }
}
