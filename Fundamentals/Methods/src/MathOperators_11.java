import java.util.Scanner;

public class MathOperators_11 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        char operator = scanner.nextLine().charAt(0);
        int secondNumber = Integer.parseInt(scanner.nextLine());

        int sum = calculate(firstNumber, operator, secondNumber);

        System.out.println(sum);
    }

    private static int calculate(int firstNumber, char operator, int secondNumber) {

        int result = 0;
        switch (operator) {
            case '/':
                result = firstNumber / secondNumber;
                break;
            case '*':
                result = firstNumber * secondNumber;
                break;
            case '+':
                result = firstNumber + secondNumber;
                break;
            case '-':
                result = firstNumber - secondNumber;
        }

        return result;
    }
}
