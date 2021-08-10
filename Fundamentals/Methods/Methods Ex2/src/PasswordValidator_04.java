import java.util.Scanner;

public class PasswordValidator_04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();

        boolean isValidLength = passwordLength(password);

        if (!isValidLength){
            System.out.println( "Password must be between 6 and 10 characters");
        }

        boolean isValidConsist = consistLetters(password);

        if (!isValidConsist){
            System.out.println("Password must consist only of letters and digits");
        }

        boolean isHaveTwoDigits = twoDigitsAtLeast(password);

        if (!isHaveTwoDigits){
            System.out.println("Password must have at least 2 digits");
        }

        if (isValidLength && isValidConsist && isHaveTwoDigits){
            System.out.println("Password is valid");
        }
    }

    private static boolean passwordLength(String password) {

        if (password.length() >= 6 && password.length() <= 10) {
            return true;
        }
        return false;
    }

    private static boolean consistLetters(String password) {
        for (int i = 0; i < password.length(); i++) {
            char currentSymbol = password.charAt(i);

            if (!Character.isLetterOrDigit(currentSymbol)){
                return false;
            }
        }
        return true;
    }

    private static boolean twoDigitsAtLeast(String password) {

        int counterDigit = 0;
        for (int i = 0; i < password.length(); i++) {
            char currentSymbol = password.charAt(i);

            if (Character.isDigit(currentSymbol)){
                counterDigit++;
            }
        }

        return counterDigit >= 2;
    }
}
