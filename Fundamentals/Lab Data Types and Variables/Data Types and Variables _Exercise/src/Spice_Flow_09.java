import java.util.Scanner;

public class Spice_Flow_09 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int startingYield = Integer.parseInt(scanner.nextLine());

        int yieldLeft = 0;
        int counterDays = 0;

        while (startingYield >= 100) {
            yieldLeft += startingYield - 26;
            startingYield -= 10;
            counterDays++;
        }
        System.out.println(counterDays);
        if (yieldLeft >= 26) {
            yieldLeft -= 26;
        }
        System.out.println(yieldLeft);

    }
}

