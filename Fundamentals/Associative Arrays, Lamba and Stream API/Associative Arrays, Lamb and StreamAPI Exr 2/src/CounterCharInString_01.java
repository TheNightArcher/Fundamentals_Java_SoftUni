import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CounterCharInString_01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        String words = scanner.nextLine();

        Map<Character,Integer> result = new LinkedHashMap<>();

        for (int i = 0; i < words.length(); i++) {

            char currentSymbol = words.charAt(i);

            if (currentSymbol == ' '){
                continue;
            }

            if (!result.containsKey(currentSymbol)){
                result.put(currentSymbol,1);
            }else {
                int currentWord = result.get(currentSymbol);
                result.put(currentSymbol, currentWord + 1);
            }
        }

        result.forEach((key, value) -> System.out.println(key + " -> " + value));
    }
}
