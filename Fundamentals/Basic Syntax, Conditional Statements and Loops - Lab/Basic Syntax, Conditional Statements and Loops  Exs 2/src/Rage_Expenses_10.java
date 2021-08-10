import java.util.Scanner;

public class Rage_Expenses_10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int lostGames = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());

        double countHeadset = lostGames / 2 * headsetPrice;
        double countMouse = lostGames / 3 * mousePrice;
        double countKeyboard = lostGames / 6 * keyboardPrice;
        double countDisplay = lostGames / 12 * displayPrice;

        double totalSum = countHeadset + countMouse +countKeyboard + countDisplay;


        System.out.printf("Rage expenses: %.2f lv.", totalSum);
    }
}
