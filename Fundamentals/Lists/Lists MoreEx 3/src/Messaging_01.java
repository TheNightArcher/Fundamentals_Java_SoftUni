import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Messaging_01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<String> numbers = Arrays.stream(scanner.nextLine()
                .split(" ")).collect(Collectors.toList());

        List<String> text = Arrays.stream(scanner.nextLine().split("")).collect(Collectors.toList());

        List<String> words = new ArrayList<>();

        int sumThem = 0;


        for (String number : numbers) {

            for (int j = 0; j < number.length(); j++) {

                char num = number.charAt(j);

                int currentNumber = Integer.parseInt(String.valueOf(num));
                sumThem += currentNumber;

            }
            if (sumThem > text.size()) {
                sumThem -= text.size();
            }
            for (int k = 0; k < text.size(); k++) {
                String word = text.get(k);
                if (k == sumThem) {
                    text.remove(word);
                    words.add(word);
                    break;
                }
            }
            sumThem = 0;
        }
        for (String word : words) {
            System.out.print(word);
        }
    }
}
