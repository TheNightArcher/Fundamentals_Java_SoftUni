import java.util.Locale;
import java.util.Scanner;

public class VowelsCount_02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine().toLowerCase();
        // a,e,i,o,u

        findingWord(word);

    }

    private static void   findingWord(String word) {

        int counter = 0;
        for (int i = 0; i < word.length(); i++) {

            char currentSymbol = word.charAt(i);

            switch (currentSymbol){
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    counter++;
                    break;
            }
        }

        System.out.println(counter);
    }
}
