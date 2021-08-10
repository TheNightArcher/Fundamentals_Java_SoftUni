import java.util.Scanner;

public class CaesarCipher_04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        StringBuilder encryptedText = new StringBuilder();
        for (char letter : text.toCharArray()) {

            int encrypt = letter + 3;
            encryptedText.append((char) encrypt);
        }

        System.out.println(encryptedText);
    }
}
