import java.util.Scanner;

public class RepeatString_07 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String words = scanner.nextLine();
        int repetitions = Integer.parseInt(scanner.nextLine());

        String printString = rowedString(words,repetitions);

        System.out.println(printString);
    }

    private static String rowedString(String words, int repetitions) {

        String result = "";
        for (int i = 0; i < repetitions; i++) {
            result = result + words;
        }
        return result;
    }
}
