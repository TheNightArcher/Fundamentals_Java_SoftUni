import java.util.Scanner;

public class Pokemon_10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int power = Integer.parseInt(scanner.nextLine());
        int distance = Integer.parseInt(scanner.nextLine());
        int exhaustionFactory = Integer.parseInt(scanner.nextLine());

        int counter = 0;
        int originalPower = power;

        while (power >= distance) {
            power -= distance;

            if (originalPower / 2 == power) {
                if (power >= exhaustionFactory && exhaustionFactory != 0) {
                    power /= exhaustionFactory;
                }
            }
            counter++;
        }

        System.out.println(power);
        System.out.println(counter);
    }
}
