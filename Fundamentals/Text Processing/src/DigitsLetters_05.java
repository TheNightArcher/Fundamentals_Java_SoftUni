import java.util.Scanner;

public class DigitsLetters_05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        String text = scanner.nextLine();


        StringBuilder numbers = new StringBuilder();
        StringBuilder letters = new StringBuilder();
        StringBuilder characters = new StringBuilder();


        for (int i = 0; i < text.length(); i++) {

            char symbol = text.charAt(i);

            if (Character.isLetter(symbol)){
                letters.append(symbol);
            }else if (Character.isDigit(symbol)){
                numbers.append(symbol);
            }else {
                characters.append(symbol);
            }
        }

        System.out.printf("%s%n%s%n%s",numbers,letters,characters);
    }
}
