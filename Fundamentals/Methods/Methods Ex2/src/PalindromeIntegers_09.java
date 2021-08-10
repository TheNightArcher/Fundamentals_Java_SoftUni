import java.util.Scanner;

public class PalindromeIntegers_09 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String number = scanner.nextLine();

        reverseString(number);


        while (!number.equals("END")) {

            System.out.println(isPalindrome(number));
            number = scanner.nextLine();
        }
    }

    private  static  boolean isPalindrome(String number){
        String reversedNumber = reverseString(number);

        return number.equals(reversedNumber);

    }

    private static String reverseString(String number) {

        String revers = "";
        for (int i = number.length() - 1; i >= 0; i--) {

            char currentSymbol = number.charAt(i);

            revers += currentSymbol;
        }
        return revers;
    }
}
