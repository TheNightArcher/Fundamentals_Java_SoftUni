import java.util.Scanner;

public class ValidUsernames_01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(", ");

        for (String username : input) {

            if (validName(username)) {
                System.out.println(username);
            }
        }
    }

    private static boolean validName(String username) {
        if (!(username.length() >= 3 && username.length() <= 16)) {
            return false;
        }

        for (char word : username.toCharArray()) {
            if (!(Character.isLetterOrDigit(word) || word == '-' || word == '_')) {
                return false;
            }
        }
        return true;
    }
}
