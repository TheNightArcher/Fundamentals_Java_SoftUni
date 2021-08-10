import java.util.Scanner;

public class Reverse_String_04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();
        String reversWord = "";

        for (int i = word.length() - 1; i >= 0; i--) {

            reversWord += word.charAt(i);
        }
        System.out.println(reversWord);
    }
}
